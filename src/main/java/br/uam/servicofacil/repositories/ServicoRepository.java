package br.uam.servicofacil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.uam.servicofacil.entities.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
	
}