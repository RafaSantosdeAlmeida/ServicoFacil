package br.uam.servicofacil.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.uam.servicofacil.entities.Cliente;
import br.uam.servicofacil.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente findClienteById(Long id) {
    	Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.get();
    }

    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
    
    public Cliente updateCliente(Long id, Cliente obj) {
    	Cliente entity = clienteRepository.getReferenceById(id);
    	updateData(entity, obj);
    	return clienteRepository.save(entity);
    }
    
    private void updateData(Cliente entity, Cliente obj) {
    	entity.setId(obj.getId());
    	entity.setEmail(obj.getEmail());
    	entity.setNome(obj.getNome());
    }
    
}