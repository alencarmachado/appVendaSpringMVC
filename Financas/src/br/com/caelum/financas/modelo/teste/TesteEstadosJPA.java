package br.com.caelum.financas.modelo.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteEstadosJPA {

	public static void main(String args[]){
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		Conta c = em.find(Conta.class, 303);
		
		
		System.out.println("id: "+c.getTitular());
		
		em.getTransaction().commit();				
		em.close();
		
		
	}
	
}
