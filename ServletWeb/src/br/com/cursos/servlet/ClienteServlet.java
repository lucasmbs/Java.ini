package br.com.cursos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClienteServlet
 */
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String filtro;
		List<String> resultado;
		
		filtro = request.getParameter("filtro");
		resultado = filtrarClientes (filtro);
		
		PrintWriter print = response.getWriter();
		
		print.write("<html><body>");
		print.write("<ul>");
		
		for (String item : resultado) {
			print.write("<li>" + item + "</li>");
			
		}
		
		print.write("</ul>");
		print.write("</body></html>");
	
	}
	
	private List<String> filtrarClientes(String filtro) {	
			
		List<String> clientes = new ArrayList<String>();
		List<String> listafiltrada = new ArrayList<String>();
		
		clientes.add("Allan Um");
		clientes.add("Frederico");
		clientes.add("Samuel");
		clientes.add("Maria Luisa");
		clientes.add("Lucas");
		clientes.add("Lucas Um");

		if (filtro != null && ! filtro.equals ("")) {
			for (String cliente : clientes) {
				if	(cliente.toUpperCase().contains(filtro.toUpperCase()))
					listafiltrada.add(cliente);
			}
		}
		else {
			listafiltrada = clientes;
		}
		return listafiltrada;	
		
	}

}
