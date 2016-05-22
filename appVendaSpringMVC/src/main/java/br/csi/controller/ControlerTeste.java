package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.csi.model.Produto;

@Controller
public class ControlerTeste {

	
	@RequestMapping("testeSpring")
	public String executa(){
		System.out.println("Executando servidor web com spiring :) ... ");
		return "ok";
	}
	
	@RequestMapping("adicionaProduto")
	public String adicionaProduto(Produto p){
		
		System.out.println("----------------------------");
		System.out.println("Descrição: "+p.getDescricao());
		
		return "ok";
	}
	
	
}


