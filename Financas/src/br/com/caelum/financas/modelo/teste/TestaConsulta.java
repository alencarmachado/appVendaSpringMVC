package br.com.caelum.financas.modelo.teste;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaConsulta {

	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		Conta c = new Conta();
		c.setId(2);
		
		Query query = em.createQuery("Select m from Movimentacao m where m.conta=:pConta "
				+ " and m.tipoMovimentacao =:pTipo"
				+ " order by m.valor desc");
		
		
		query.setParameter("pConta", c);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);
		
		List<Movimentacao> movimentacao = query.getResultList();
		
		for(Movimentacao m : movimentacao){
			System.out.println("\nDescricao ..:"+m.getDescricao());
			System.out.println("Valor....:"+m.getValor());
		}
		
		
	}
	
}
