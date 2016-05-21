package br.com.caelum.financas.modelo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class FinancasTeste {

	/**
	 * @param args
	 */
	public static void main(String args[]){
		
		
		
		Conta c = new Conta();
		c.setId(352);
		c.setTitular("Alencar Managed");
		c.setBanco(" Managed BB 3");
		c.setNumero("12343");
		c.setAgencia("Managed agencia3 ");
		
		
		 
		 	
		EntityManager manager =  new JPAUtil().getEntityManager();
		
		double inicio = System.currentTimeMillis();		
		manager.getTransaction().begin();
		
		Conta cc = manager.find(Conta.class, 352);
		manager.remove(cc);
		 
		
		manager.getTransaction().commit();
	 
		
		  manager.close();
	}
	
}
