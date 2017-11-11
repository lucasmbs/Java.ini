package br.com.FundamentosBasicosJava;




/**
 * Servlet implementation class Tipo
 */

  
public class Tipo {

	public int x = 6;
	public int y = 7;
    
	/**
     * Default constructor. 
     */
    public Tipo() {
        // TODO Auto-generated constructor stub
    }

    public String Soma(){ 
    	
    	int resultado = x + y;
    	return "O valor da soma é" + resultado;	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
