package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.cliente.model.Cliente;


public class ClienteDao {
	
	private List <Cliente> clientes;
	
	public ClienteDao() {
		initMock();
	}
	
	private void initMock() {
		clientes = new ArrayList <Cliente>();
		Cliente cliente1 = new Cliente();
		cliente1.setId(1);
		cliente1.setNome("Lucas");
		cliente1.setSobrenome("Mendes");
		cliente1.setIdade(31);
		cliente1.setTelefone("22222222");
		clientes.add(cliente1);

		clientes.add(new Cliente(1, "Maria Luísa", "Mendes", 2, "N/A"));
	}

	public List<Cliente> obterTodosClientes() {
		return this.clientes;
	}
	
	
	
}
