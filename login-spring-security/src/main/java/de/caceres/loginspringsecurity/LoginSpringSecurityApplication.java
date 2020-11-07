package de.caceres.loginspringsecurity;

import de.caceres.loginspringsecurity.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class LoginSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginSpringSecurityApplication.class, args);
	}

}
