package br.com.caelum.lojas.controller;



 
 

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.lojas.dao.ProdutoDao;
import br.com.caelum.lojas.infra.SalvarAquivo;
import br.com.caelum.lojas.models.Produto;
import br.com.caelum.lojas.models.TipoPreco;



@Transactional
@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoDao dao;
	 
	@Autowired
	private SalvarAquivo salvarArquivo;
	

	@RequestMapping("formProdutos")
	public ModelAndView form(Produto produto){
		
		
		return new ModelAndView("produtos/form").addObject("tipos", TipoPreco.values());
	}
 
	
	@RequestMapping("adicionaProdutos")
	public ModelAndView gravar(MultipartFile sumario ,@Valid Produto produto, BindingResult errosValidacao){
		
		System.out.println("Dentro do adicionaProdutos..");
		System.out.println(" nome do arquivo: "+sumario.getOriginalFilename());
		System.out.println(" "+produto.getDescricao());
		System.out.println(" "+produto.getPaginas());
		System.out.println(" "+produto.getTitulo());
		
		if(errosValidacao.hasErrors()){
			System.out.println("Dentro do hasErros ..");
			return new ModelAndView("produtos/form").addObject("tipos", TipoPreco.values()).addObject(produto);
			
		}else{
			System.out.println("...... vai adicionar ...");
			//ProdutoDao dao = new ProdutoDao();
			String caminho = salvarArquivo.write("arquivosapp", sumario);
			System.out.println("Caminho ... "+caminho);
			produto.setSumarioPath(caminho);
			dao.adiciona(produto);
			
			return new ModelAndView("produtos/form").addObject("tipos", TipoPreco.values());
				
		}
		
		
	}
	
	@RequestMapping("/listaProdutos")
	public ModelAndView listar(){		
		return new ModelAndView("produtos/lista").addObject("produtos", dao.listar());
	}
	
	
	
	@RequestMapping("/detalhes")
	public ModelAndView detalhe(Integer id){
		ModelAndView model = new ModelAndView("produtos/detalhe");
		Produto p = dao.find(id);
		model.addObject("produto", p);
		return model;
	}
	
	
	
	
	
}
