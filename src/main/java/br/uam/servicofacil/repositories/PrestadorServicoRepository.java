package br.uam.servicofacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uam.servicofacil.entities.PrestadorServico;

public interface PrestadorServicoRepository extends JpaRepository<PrestadorServico, Long> {
	
}