package br.uam.servicofacil.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uam.servicofacil.entities.Cliente;
import br.uam.servicofacil.entities.PrestadorServico;
import br.uam.servicofacil.services.PrestadorServicoService;

@RestController
@RequestMapping("/prestadores")
public class PrestadorServicoController {
    private final PrestadorServicoService service;

    public PrestadorServicoController(PrestadorServicoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PrestadorServico>> getAllPrestadores() {
    	List<PrestadorServico> list = service.findAllPrestadores();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PrestadorServico> getPrestadorById(@PathVariable Long id) {
    	PrestadorServico obj = service.findPrestadorById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<PrestadorServico> savePrestador(@RequestBody PrestadorServico prestador) {
    	prestador = service.savePrestador(prestador);
    	return ResponseEntity.ok().body(prestador);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestador(@PathVariable Long id) {
    	service.deletePrestador(id);
        return ResponseEntity.noContent().build();
    }
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<PrestadorServico> update(@PathVariable Long id, @RequestBody PrestadorServico obj){
    	obj = service.updatePrestadorServico(id, obj);
    	return ResponseEntity.ok().body(obj);
    }
    
}