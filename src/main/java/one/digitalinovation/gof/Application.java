package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Projeto Spring Boot gerado via Spring Initializer.
 * Os Seguintes Módulos foram selecionados:
 *  -Spring Data JPA
 *  -Spring Web
 *  -H2 Database
 *  -OpenFeign
 * 
 * @author lucas
 *
 */


@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
