package br.uam.servicofacil.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_prestador_servico")
public class PrestadorServico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especialidade;
    private String email;
    
    public PrestadorServico() {
    	
    }
    
	public PrestadorServico(Long id, String nome, String especialidade, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.especialidade = especialidade;
		this.email = email;
	}
    
}