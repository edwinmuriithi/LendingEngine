package com.peerlender.lendingengine;
import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class lendingengineApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(lendingengineApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(1, "Troy", "Siro", 32, "Digital Sales"));
		userRepository.save(new User(2, "Ryan", "Ndiri", 22, "Councillor"));
		userRepository.save(new User(3, "Victor", "Tutu", 34, "Radiologist"));
	}

	}




