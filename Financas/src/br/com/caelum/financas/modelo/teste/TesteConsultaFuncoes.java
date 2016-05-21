package br.com.caelum.financas.modelo.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.type.descriptor.java.BigDecimalTypeDescriptor;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaFuncoes {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		Conta c = em.find(Conta.class, 3);
		
		/*String jpql = "select sum(m.valor) from Movimentacao m where m.conta =:pConta and "
				+ " m.tipoMovimentacao=:pTipo";
		String jpqlMedia = "select avg(m.valor) from Movimentacao m where m.conta =:pConta and "
				+ " m.tipoMovimentacao=:pTipo";
		
		
		
		TypedQuery<BigDecimal> query = em.createQuery(jpql, BigDecimal.class);
		TypedQuery<Double> queryMedia = em.createQuery(jpqlMedia, Double.class);
		
		query.setParameter("pConta", c);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);
		queryMedia.setParameter("pConta", c);
		queryMedia.setParameter("pTipo", TipoMovimentacao.SAIDA);
		
		BigDecimal result =  query.getSingleResult();
		Double media = queryMedia.getSingleResult();*/
		
		System.out.println("TITULAR .............:"+c.getTitular());
		//System.out.println("TOTAL movimentação ..:"+result);
		//System.out.println("MEDIA da movimentação ..:"+media);
		
		MovimentacaoDao mDao = new MovimentacaoDao(em);
		
		System.out.println("MEDIA da movimentação ..:"+mDao.mediaDaContaPeloTipo(c, TipoMovimentacao.SAIDA));
		System.out.println("Maior gasto da conta ...:"+mDao.maiorGastoDaConta(c));
		
	}
	
}
