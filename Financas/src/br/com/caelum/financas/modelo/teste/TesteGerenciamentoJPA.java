package br.com.caelum.financas.modelo.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteGerenciamentoJPA {

	public static void main(String args[]){
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta c = em.find(Conta.class, 1);
		em.getTransaction().commit();
		
		c.setTitular("comit antes da alteração");
	
		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();
		
		em.close();
		
		
	}
	
}
