package br.com.caelum.financas.modelo.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteJPARelacionamento {

	public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setId(1);
        conta.setTitular("santo");

        Movimentacao movimentacao = new Movimentacao();
        movimentacao.setData(Calendar.getInstance());
        movimentacao.setDescricao("Conta na zona 1");
        movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
        movimentacao.setValor(new BigDecimal("1123.9"));

        movimentacao.setConta(conta);

        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();

        manager.merge(conta);
        manager.persist(movimentacao);

        manager.getTransaction().commit();
        manager.close();

    }
}
	


