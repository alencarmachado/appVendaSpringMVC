package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//org.springframework.web.servlet.DispatcherServlet

@Controller
public class ControlerTeste {

	
	@RequestMapping("testeSpring")
	public String executa(){
		System.out.println("Executando servidor web com spiring :) ... ");
		return "ok";
	}
	
}
