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
	private PrestadorServicoRepository repository;

	public PrestadorServicoService(PrestadorServicoRepository repository) {
        this.repository = repository;
    }

    public List<PrestadorServico> findAllPrestadores() {
        return repository.findAll();
    }

    public PrestadorServico findPrestadorById(Long id) {
    	Optional<PrestadorServico> obj = repository.findById(id);
        return obj.get();
    }

    public PrestadorServico savePrestador(PrestadorServico prestador) {
        return repository.save(prestador);
    }

    public void deletePrestador(Long id) {
        repository.deleteById(id);
    }
}