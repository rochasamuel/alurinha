package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando Empresa");
    	
    	String data = request.getParameter("data");
    	String nomeEmpresa = request.getParameter("nome");
    	
    	Date abertura = null;
    	
    	try {
    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			abertura = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
    	
    	Empresa empresa = new Empresa();
    	empresa.setNome(nomeEmpresa);
    	empresa.setDataAbertura(abertura);
    	
    	Banco banco = new Banco();
    	banco.adiciona(empresa);  
    	
    	response.sendRedirect("entrada?acao=ListaEmpresas");
    	
//    	RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
//    	request.setAttribute("empresa", nomeEmpresa);
//    	rd.forward(request, response); 
	}
}
