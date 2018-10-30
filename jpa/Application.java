package pl.coreservices.bootcamp.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.coreservices.bootcamp.jpa.model.Post;

import javax.persistence.EntityManager;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(EntityManager entityManager) {
		return (args)->{

			entityManager.getTransaction().begin();
			entityManager.persist(new Post());
			entityManager.getTransaction().commit();


		};
	}
}
