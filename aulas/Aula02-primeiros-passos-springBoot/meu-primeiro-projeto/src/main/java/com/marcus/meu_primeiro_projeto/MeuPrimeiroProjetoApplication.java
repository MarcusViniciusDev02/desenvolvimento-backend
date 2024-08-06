package com.marcus.meu_primeiro_projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/app")
public class MeuPrimeiroProjetoApplication {
	@GetMapping("/nome/{nome}")
	public String cumprimentar(@PathVariable("nome") String nome){
		return "Olá " + nome;
	}

	@GetMapping("/idade/{idade}")
	public String verificarMaioridade(@PathVariable("idade") String idade){
		int idadeConvertida = Integer.parseInt(idade);
		if(idadeConvertida >= 18){
			return "Maior de idade";
		}
		return "Menor de idade";
	}
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
	}

}
