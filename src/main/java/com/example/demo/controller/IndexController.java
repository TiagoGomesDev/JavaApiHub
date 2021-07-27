package com.example.demo.controller;

import java.util.HashMap;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class IndexController {

	@GetMapping
	public String bemVindo() {
		return "Bem vindo";
	}
	@GetMapping("/pesquisaNome")
	public String resgataNome(@RequestParam("matricula") Integer matricula) {
		
		//Cria o dicionario
		HashMap<Integer,String> dicionario = new HashMap<Integer,String>();

		//Preenche o dicionario
		dicionario.put(1, "Paschoal");
		dicionario.put(2, "Moises");
		dicionario.put(3, "Hamilton");
				
		//Resgata a informação a partir da matricula
		String nome = dicionario.get(matricula);
		
		//Retorna o nome
		return nome;
	}
	@GetMapping("/nome")
	public String bemVindoNome(@RequestParam("nome") String nome) {
		return "Bem vindo " + nome;
	}
	@GetMapping("/helloGestor")
	public String bemVindoGestor(){
		return "Bem vindo Gestor";
	}

}
