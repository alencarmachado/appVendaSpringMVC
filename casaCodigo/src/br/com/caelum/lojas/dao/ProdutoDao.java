package br.com.caelum.lojas.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.lojas.models.Modelo;
import br.com.caelum.lojas.models.Produto;
import br.com.caelum.lojas.util.JPAUtil;

@Repository
public class ProdutoDao implements Dao {
	
	@PersistenceContext
	private EntityManager em;
	
 
	@Override
	public void adiciona(Modelo m) {
		//em = new JPAUtil().getEntityManager();
		//em.getTransaction().begin();
		Produto p = (Produto) m;
		System.out.println(" Título "+p.getTitulo());
		System.out.println("des "+p.getDescricao());
		System.out.println(" Paginas "+p.getPaginas());
		
		em.persist(p);
		//em.getTransaction().commit();
		//em.close();
		
	}

	@Override
	public void altera(Modelo m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removo(Modelo m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finaliza(Modelo m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produto> listar() {		 	 		 
		return   em.createQuery("select p from Produto p", Produto.class).getResultList();
	}

	public Produto find(Integer id) {
		// TODO Auto-generated method stub
		return em.find(Produto.class, id);
		//return em.createQuery("select distinct(p) from Produto p 
		//join fetch p.precos precos where p.id = :id", Produto.class).setParameter("id", id).getSingleResult();

	}
	
	
	
}
