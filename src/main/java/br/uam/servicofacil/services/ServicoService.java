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
    private ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> findAllServicos() {
        return servicoRepository.findAll();
    }

    public Servico findServicoById(Long id) {
    	Optional<Servico> obj = servicoRepository.findById(id);
        return obj.get();
    }

    public Servico saveServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public void deleteServico(Long id) {
        servicoRepository.deleteById(id);
    }

    public Servico updateServico(Long id, Servico obj) {
    	Servico entity = servicoRepository.getReferenceById(id);
    	updateData(entity, obj);
    	return servicoRepository.save(entity);
    }
    
    private void updateData(Servico entity, Servico obj) {
    	entity.setId(obj.getId());
    	entity.setData(obj.getData());
    	entity.setDescricao(obj.getDescricao());
    	entity.setCliente(obj.getCliente());
    	entity.setPrestador(obj.getPrestador());
    }
    
}