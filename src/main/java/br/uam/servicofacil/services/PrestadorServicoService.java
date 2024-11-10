package br.uam.servicofacil.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uam.servicofacil.entities.PrestadorServico;
import br.uam.servicofacil.repositories.PrestadorServicoRepository;

@Service
public class PrestadorServicoService {
	@Autowired
	private final PrestadorServicoRepository repository;

	public PrestadorServicoService(PrestadorServicoRepository repository) {
        this.repository = repository;
    }

    public List<PrestadorServico> getAllPrestadores() {
        return repository.findAll();
    }

    public Optional<PrestadorServico> getPrestadorById(Long id) {
        return repository.findById(id);
    }

    public PrestadorServico savePrestador(PrestadorServico prestador) {
        return repository.save(prestador);
    }

    public void deletePrestador(Long id) {
        repository.deleteById(id);
    }
}