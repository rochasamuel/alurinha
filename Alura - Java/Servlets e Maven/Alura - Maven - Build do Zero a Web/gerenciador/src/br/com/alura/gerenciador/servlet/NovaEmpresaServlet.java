package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
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
    	
    	response.sendRedirect("listaEmpresas");
    	
//    	RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
//    	request.setAttribute("empresa", nomeEmpresa);
//    	rd.forward(request, response);    	
    }
}
