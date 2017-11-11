package br.com.cliente.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.ClienteDao;
import br.com.cliente.model.Cliente;

/**
 * Servlet implementation class BuscaServlet
 */
public class BuscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BuscaServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		 
		ClienteDao clienteDao = new ClienteDao();
		List<Cliente> clientes = clienteDao.obterTodosClientes();
		
		out.write("<ul>");
		
		for(int indice = 0; indice < clientes.size(); indice++) {
			out.write("<li>");
			out.write("Cliente: " + clientes.get(indice).getNomeCompleto());
			out.write("<br>");
			out.write("Cliente: " + clientes.get(indice));
			out.write("<br>");
			out.write("<br>");
			out.write("</li>");
		}
		out.write("</ul>");
		out.write("</body></html>");
	}

}
