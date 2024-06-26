package main.data;

import org.springframework.data.repository.CrudRepository;

import main.dominio.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	

}
