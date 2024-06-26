package main.data;

import java.util.Optional;

import main.dominio.Cliente;
import main.dominio.Servicio;

public interface ModeloInterface {
	
	public int contarClientes();
	public int contarServicios();
	
	public void altaCliente(Cliente cliente);
	public void bajaCliente(Cliente cliente);
	public Optional<Cliente> consultaClienteID(int id);

	public void altaServicio(Servicio servicio);
	public void bajaServicio(Servicio servicio);
	public Optional<Servicio> consultaServicioID(int id);
		
}