package de.caceres.loginspringsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.UserDetails;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 1. Security rules – just strings, NO AntPathRequestMatcher
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/admin/**").hasRole("ADMIN")
                .requestMatchers("/user/**").hasAnyRole("ADMIN", "USER")
                .requestMatchers("/", "/home", "/public/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(Customizer.withDefaults())   // default Spring login page
            .logout(Customizer.withDefaults());

        return http.build();
    }

    // 2. In-memory users – these are the only accounts that exist
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();

        UserDetails admin = User.builder()
                .username("admin")
                .password(encoder.encode("admin"))   // password = admin
                .roles("ADMIN", "USER")
                .build();

        UserDetails normalUser = User.builder()
                .username("user")
                .password(encoder.encode("user"))     // password = user
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, normalUser);
    }

    // 3. BCrypt encoder (required – never use NoOp in real code)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}