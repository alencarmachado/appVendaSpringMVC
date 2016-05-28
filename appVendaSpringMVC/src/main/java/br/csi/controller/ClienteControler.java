package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteControler {

	@RequestMapping("adicionaCliente")
	public String adicinaCliente(){
		return "template";
	}
	
}
