package br.uam.servicofacil.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uam.servicofacil.entities.Servico;
import br.uam.servicofacil.services.ServicoService;

@RestController
@RequestMapping("/servicos")
public class ServicoController {
    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    @GetMapping
    public ResponseEntity<List<Servico>> getAllServicos() {
    	List<Servico> list = servicoService.findAllServicos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> getServicoById(@PathVariable Long id) {
    	Servico obj = servicoService.findServicoById(id);
    	return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Servico> saveServico(@RequestBody Servico servico) {
    	Servico servico1 = servicoService.saveServico(servico);
        return ResponseEntity.ok().body(servico1);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteServico(@PathVariable Long id) {
        servicoService.deleteServico(id);
        return ResponseEntity.noContent().build();
    }
}