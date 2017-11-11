package br.com.FundamentosBasicosJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Httpaula2 extends HttpServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Tipo meutipo = new Tipo();
		PrintWriter tela = response.getWriter();
		tela.write("<html><body>");

		tela.write("Opa " + meutipo.x + " " + meutipo.y);
		tela.write(" Lucas " + meutipo.Soma());
	
		meutipo.x = 15; 
		meutipo.y = 20;	
		int a = meutipo.x;
		int b = meutipo.y; 
		
			

		tela.write("Opa " + a + " " + b);
		tela.write(" Lucas " + meutipo.Soma());
		tela.write("</body></html>");
	}

	
}
