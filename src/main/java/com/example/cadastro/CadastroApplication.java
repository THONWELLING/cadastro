package com.example.cadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroApplication {

	public static void main(String[] args) {

		SpringApplication.run(CadastroApplication.class, args);

		System.out.println("Server Is Running At The Port ===> 8080");
	}

}
