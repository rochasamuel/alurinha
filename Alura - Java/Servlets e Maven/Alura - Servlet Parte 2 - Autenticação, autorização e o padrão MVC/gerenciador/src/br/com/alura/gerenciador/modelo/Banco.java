package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa e1 = new Empresa();
		e1.setId(chaveSequencial++);
		e1.setNome("Alura");
		Empresa e2 = new Empresa();
		e2.setId(chaveSequencial++);
		e2.setNome("Caelum");
		empresas.add(e1);
		empresas.add(e2);
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = empresas.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}
	
	public void adiciona(Empresa e) {
		e.setId(Banco.chaveSequencial++);
		Banco.empresas.add(e);
	}
	
	public static List<Empresa> getEmpresas() {
		return Banco.empresas;
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : empresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
