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
    public List<PrestadorServico> getAllPrestadores() {
        return service.getAllPrestadores();
    }

    @GetMapping("/{id}")
    public Optional<PrestadorServico> getPrestadorById(@PathVariable Long id) {
        return service.getPrestadorById(id);
    }

    @PostMapping
    public PrestadorServico savePrestador(@RequestBody PrestadorServico prestador) {
        return service.savePrestador(prestador);
    }

    @DeleteMapping("/{id}")
    public void deletePrestador(@PathVariable Long id) {
        service.deletePrestador(id);
    }
}