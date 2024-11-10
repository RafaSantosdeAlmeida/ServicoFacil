package br.uam.servicofacil.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_servico")
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "prestador_id")
    private PrestadorServico prestador;

    private String descricao;
    private LocalDate data;
    
    public Servico() {
    	
    }
    
	public Servico(Long id, Cliente cliente, PrestadorServico prestador, String descricao, LocalDate data) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.prestador = prestador;
		this.descricao = descricao;
		this.data = data;
	}
    
}