package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

System.out.println("Alterando Empresa");
    	
    	String data = request.getParameter("data");
    	String nomeEmpresa = request.getParameter("nome");
    	String idParam = request.getParameter("id");
    	Integer id = Integer.valueOf(idParam);
    	
    	Date abertura = null;
    	
    	try {
    		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			abertura = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
    	
    	Banco banco = new Banco();
    	Empresa empresa = banco.buscaEmpresaPeloId(id);
    	empresa.setNome(nomeEmpresa);
    	empresa.setDataAbertura(abertura);
    	
    	response.sendRedirect("listaEmpresas");
	}

}
