package Proyecto.udea.proyectoUdea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class ProyectoUdeaApplication {

	@GetMapping("/hello")
	public String hello(){return "hola Ciclo 3... Saldremos vivos de esta!";}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoUdeaApplication.class, args);}

}
