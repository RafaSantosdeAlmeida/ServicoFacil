package br.uam.servicofacil.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uam.servicofacil.entities.Servico;
import br.uam.servicofacil.repositories.ServicoRepository;

@Service
public class ServicoService {
	@Autowired
    private final ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> getAllServicos() {
        return servicoRepository.findAll();
    }

    public Optional<Servico> getServicoById(Long id) {
        return servicoRepository.findById(id);
    }

    public Servico saveServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public void deleteServico(Long id) {
        servicoRepository.deleteById(id);
    }
}