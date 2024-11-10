package br.uam.servicofacil.controller;

import java.util.List;
import java.util.Optional;

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
    public List<Servico> getAllServicos() {
        return servicoService.getAllServicos();
    }

    @GetMapping("/{id}")
    public Optional<Servico> getServicoById(@PathVariable Long id) {
        return servicoService.getServicoById(id);
    }

    @PostMapping
    public Servico saveServico(@RequestBody Servico servico) {
        return servicoService.saveServico(servico);
    }

    @DeleteMapping("/{id}")
    public void deleteServico(@PathVariable Long id) {
        servicoService.deleteServico(id);
    }
}