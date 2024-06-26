package main.data;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dominio.Cliente;
import main.dominio.Servicio;

@Service
public class Modelo implements ModeloInterface{
	
	@Autowired
	private ClienteRepository clienteDAO;
	
	@Autowired
	private ServicioRepository servicioDAO;
	
	// Métodos de ModeloInterface
	
	@Override
	public void altaCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDAO.save(cliente);
		
	}
	@Override
	public void bajaCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteDAO.delete(cliente);
		
	}
	@Override
	public void altaServicio(Servicio servicio) {
		// TODO Auto-generated method stub
		servicioDAO.save(servicio);
		
	}
	@Override
	public void bajaServicio(Servicio servicio) {
		// TODO Auto-generated method stub
		servicioDAO.delete(servicio);
		
	}
	@Override
	public int contarClientes() {
		// TODO Auto-generated method stub
		return (int) clienteDAO.count();
	}
	@Override
	public int contarServicios() {
		// TODO Auto-generated method stub
		return (int) servicioDAO.count();
	}
	@Override
	public Optional<Cliente> consultaClienteID(int id) {
		Optional<Cliente> c = clienteDAO.findById(id);
		return c;
	}
	@Override
	public Optional<Servicio> consultaServicioID(int id) {
		Optional<Servicio> s = servicioDAO.findById(id);
		return s;
	}



		
}