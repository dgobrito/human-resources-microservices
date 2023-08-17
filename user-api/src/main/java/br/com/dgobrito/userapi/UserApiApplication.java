package br.com.dgobrito.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dgobrito.userapi.domain.User;
import br.com.dgobrito.userapi.repositories.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
			new User(null, "Dyego Brito", "dgobrito@github.com", "123", 20.0)
		));
	}
}