package br.com.caelum.financas.modelo.teste;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteMovimentacaoConta {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		//Movimentacao m = em.find(Movimentacao.class, 7);
		
		System.out.println("**************");
		//System.out.println("Titular da conta: "+m.getConta().getTitular());

		
		Query query = em.createQuery("select distinct c from Conta c join fetch c.movimentacoes");
		
		List<Conta> contas = query.getResultList();
		em.close();
		for(Conta c : contas){
			System.out.println("**************");
			System.out.println("TITULAR: "+c.getTitular());
			System.out.println("Número e movimentação: "+c.getMovimentacoes().size());
		}
		
		
	}
	
}
