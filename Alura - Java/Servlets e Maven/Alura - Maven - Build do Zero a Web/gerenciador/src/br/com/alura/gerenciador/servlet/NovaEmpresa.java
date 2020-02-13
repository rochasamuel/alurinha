package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	System.out.println("Cadastrando Empresa");
    	
    	String nomeEmpresa = request.getParameter("nome");
    	Empresa empresa = new Empresa();
    	empresa.setNome(nomeEmpresa);
    	
    	Banco banco = new Banco();
    	banco.adiciona(empresa);  
    	
    	RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
    	request.setAttribute("empresa", nomeEmpresa);
    	rd.forward(request, response);    	
    }
}
