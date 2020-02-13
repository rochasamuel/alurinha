package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<>();
	
	static {
		Empresa e1 = new Empresa();
		e1.setNome("Alura");
		Empresa e2 = new Empresa();
		e2.setNome("Caelum");
		empresas.add(e1);
		empresas.add(e2);
	}
	
	public void adiciona(Empresa e) {
		Banco.empresas.add(e);
	}
	
	public static List<Empresa> getEmpresas() {
		return Banco.empresas;
	}
}
