package br.com.alura.linguagens.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//exclude = SecurityAutoConfiguration.class)
@SpringBootApplication()
public class LinguagensApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinguagensApiApplication.class, args);
	}
}
