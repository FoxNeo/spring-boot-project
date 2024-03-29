package site.sample.externalwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 
 * @author Miguel Caceres This Spring Boot application runs on Tomcat
 */
@SpringBootApplication
public class ExternalwarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalwarApplication.class, args);
	}
}
