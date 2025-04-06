package com.example.treinetic_devops_intern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class TreineticDevopsInternApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreineticDevopsInternApplication.class, args);
	}

	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
}
