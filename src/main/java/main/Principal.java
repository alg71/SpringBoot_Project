package main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import main.data.ClienteRepository;
import main.data.Modelo;
import main.data.ServicioRepository;
import main.dominio.Cliente;
import main.dominio.Servicio;

@SpringBootApplication
public class Principal implements CommandLineRunner{
	
	@Autowired
	Modelo modelo;

	public static void main(String[] args) {
		SpringApplication.run(Principal.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		
		// Conteo inicial
		System.out.println("Conteo inicial");
		System.out.println("Hay: " + modelo.contarClientes() + " clientes");
		System.out.println("Hay: " + modelo.contarServicios() + " servicios");
		System.out.println();
		
		// Guardar un cliente
		System.out.println("Guardando cliente...");;
		Cliente c1 = new Cliente();
		c1.setNombre("Elio");
		c1.setTelefono("666000666");
		modelo.altaCliente(c1);
		System.out.println("Cliente guardado!");
		System.out.println();
		
		// Guardar un servicio
		System.out.println("Guardando servicio...");
		Servicio s1 = new Servicio();
		s1.setClienteId(c1);
		s1.setDescripcion("asdf");
		s1.setImporte(50.0);
		s1.setFecha(new Date(01, 01, 1900));
		modelo.altaServicio(s1);
		System.out.println("Cliente guardado!");
		System.out.println();
		
		// Consultar un cliente
		System.out.println("Nombre del primer cliente:");
		System.out.println(modelo.consultaClienteID(1).get().getNombre());
		System.out.println();
		System.out.println("Consulta el importe del 1º Servicio del 1º cliente");
		System.out.println(modelo.consultaClienteID(1).get().getServicioList().get(0).getImporte());
		System.out.println("Servicio con Id 1");
		System.out.println(modelo.consultaServicioID(1));
		System.out.println();
		System.out.println("Conteo final");
		System.out.println("Hay: " + modelo.contarClientes() + " clientes");
		System.out.println("Hay: " + modelo.contarServicios() + " servicios");
		System.out.println();
		
		
		
		
		
	}

}