package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/teste")
	 public String teste(){
		 System.out.println("Dentro do HomeController");
		 return "teste";
	 }
}
