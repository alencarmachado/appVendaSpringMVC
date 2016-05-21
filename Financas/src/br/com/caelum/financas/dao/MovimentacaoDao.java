package br.com.caelum.financas.dao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;

public class MovimentacaoDao {

	private EntityManager em;
	public MovimentacaoDao(EntityManager em){
		this.em = em;
	}
	
	public Double mediaDaContaPeloTipo(Conta conta, TipoMovimentacao tipo){
		
			TypedQuery<Double> query = em.createQuery("Select avg(m.valor) from Movimentacao m where"
					+ " m.conta=:pConta and m.tipoMovimentacao =:pTipo ",Double.class);
		
			query.setParameter("pConta", conta);
			query.setParameter("pTipo", tipo);
			
		return query.getSingleResult();
	}

	public BigDecimal maiorGastoDaConta(Conta conta){
		
		TypedQuery<BigDecimal> query = em.createQuery("Select max(m.valor) from Movimentacao m where"
				+ " m.conta=:pConta",BigDecimal.class);
	
		query.setParameter("pConta", conta);
 
		
	return query.getSingleResult();
}

	
}
