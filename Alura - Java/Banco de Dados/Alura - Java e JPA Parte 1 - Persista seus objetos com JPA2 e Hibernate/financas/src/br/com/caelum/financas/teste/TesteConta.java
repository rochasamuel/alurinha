package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Samuel Rocha");
		conta.setAgencia("1507");
		conta.setNumero("70140");
		conta.setBanco("Banco do Brasil");
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();		
		
		em.close();
		
		/*Teste Remover Conta*/
//		em.getTransaction().begin();
//		
//		conta = em.find(Conta.class, 8);
//		em.remove(conta);
//		
//		em.getTransaction().commit();
//		
//		em.close();
	}
}
