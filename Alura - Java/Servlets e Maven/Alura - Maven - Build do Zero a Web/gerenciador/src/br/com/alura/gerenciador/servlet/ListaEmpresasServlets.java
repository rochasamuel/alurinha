package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaEmpresas")
public class ListaEmpresasServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Empresa> lista = Banco.getEmpresas();
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<ul>");
		
		lista.forEach((empresa) -> out.println("<li>" + empresa.getNome() + "</li>"));
		
		out.println("</ul>");
		out.println("</html></body>");
		
	}

}
