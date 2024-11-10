package br.uam.servicofacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uam.servicofacil.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}