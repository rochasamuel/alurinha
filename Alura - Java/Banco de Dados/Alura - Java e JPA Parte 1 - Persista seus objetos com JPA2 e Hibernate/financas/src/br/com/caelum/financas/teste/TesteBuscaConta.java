package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteBuscaConta {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		/*Devolve uma conta no estado Managed que é quando o objeto que foi buscado
		está em total sincronia com o banco o que for alterado na aplicação será
		alterado no banco.*/
		Conta conta = em.find(Conta.class, 1);
		
		conta.setTitular("Samuel Rocha");
		conta.setBanco("001 - BANCO DO BRASIL");
		conta.setNumero("70140-8");
		
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();

	}

}
