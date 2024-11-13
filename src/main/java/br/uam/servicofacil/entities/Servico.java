package br.uam.servicofacil.entities;

import java.sql.Timestamp;
import java.time.LocalDate;

import java.util.Objects;

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
	
	private static final long serialVersionUID = 1L;
	
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
    private Double valorServico;
    private Double gorjeta;
    private Double taxaApp;
    private Double avaliacao;
    private String comentario;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;
    private String complemento;
    private String cep;
    private String tipoServico;
    private Timestamp horaInicio;
    private Timestamp horaFim;
    private Timestamp tempoDuracao;
    
    public Servico() {
    	
    }

	public Servico(Long id, Cliente cliente, PrestadorServico prestador, String descricao, LocalDate data,
				   Double valorServico, Double gorjeta, Double taxaApp, Double avaliacao, String comentario, String endereco,
				   int numero, String cidade, String estado, String complemento, String cep, String tipoServico,
				   Timestamp horaInicio, Timestamp horaFim, Timestamp tempoDuracao) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.prestador = prestador;
		this.descricao = descricao;
		this.data = data;
		this.valorServico = valorServico;
		this.gorjeta = gorjeta;
		this.taxaApp = taxaApp;
		this.avaliacao = avaliacao;
		this.comentario = comentario;
		this.endereco = endereco;
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
		this.cep = cep;
		this.tipoServico = tipoServico;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.tempoDuracao = tempoDuracao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public Double getGorjeta() {
		return gorjeta;
	}

	public void setGorjeta(Double gorjeta) {
		this.gorjeta = gorjeta;
	}

	public Double getTaxaApp() {
		return taxaApp;
	}

	public void setTaxaApp(Double taxaApp) {
		this.taxaApp = taxaApp;
	}

	public Double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public Timestamp getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Timestamp horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Timestamp getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Timestamp horaFim) {
		this.horaFim = horaFim;
	}

	public Timestamp getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(Timestamp tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public int hashCode() {
		int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servico other = (Servico) obj;
        return Objects.equals(this.id, other.id);
	}
    
}