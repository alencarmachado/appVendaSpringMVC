package br.com.caelum.lojas.dao;

 
import java.util.List;

import br.com.caelum.lojas.models.Modelo;
import br.com.caelum.lojas.models.Produto;

public interface Dao {

	void adiciona(Modelo m);
	void altera(Modelo m);
	void removo(Modelo m);
	void finaliza(Modelo m);
	List<Produto> listar();
}
