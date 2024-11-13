package br.uam.servicofacil.config;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.uam.servicofacil.entities.Cliente;
import br.uam.servicofacil.entities.PrestadorServico;
import br.uam.servicofacil.entities.Servico;
import br.uam.servicofacil.repositories.ClienteRepository;
import br.uam.servicofacil.repositories.PrestadorServicoRepository;
import br.uam.servicofacil.repositories.ServicoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private PrestadorServicoRepository prestadorServicoRepository;
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente1 = new Cliente(null, "Alice Silva", "Feminino", "alice.silva@gmail.com", "11987654321",
			"Rua das Flores, 123", 11, 987654321, "São Paulo", "SP", "Apto 101", "12345678", "Centro", "123456789", 
			"123.456.789-00", "1990-05-15", 750.0);
		Cliente cliente2 = new Cliente(null, "Bruno Costa", "Masculino", "bruno.costa@gmail.com", "21987654321",
			"Av. Brasil, 456", 21, 998765432, "Rio de Janeiro", "RJ", "Casa", "87654321", "Copacabana", 
			"234567890", "234.567.890-11", "1985-07-20", 620.0);
		Cliente cliente3 = new Cliente(null, "Carla Mendes", "Feminino", "carla.mendes@gmail.com", "31987654321",
			"Rua das Palmeiras, 789", 31, 987654321, "Belo Horizonte", "MG", "Bloco B", "65432198", 
			"Savassi", "345678901", "345.678.901-22", "1992-03-10", 680.0);
		Cliente cliente4 = new Cliente(null, "Diego Oliveira", "Masculino", "diego.oliveira@gmail.com", "41987654321",
			"Av. das Nações, 101", 41, 998765432, "Curitiba", "PR", "Apto 202", "87654312", 
			"Centro", "456789012", "456.789.012-33", "1988-10-05", 800.0);
		Cliente cliente5 = new Cliente(null, "Eliana Santos", "Feminino", "eliana.santos@gmail.com", "51987654321",
			"Rua do Comércio, 111", 51, 987654321, "Porto Alegre", "RS", "Casa", "54321678", 
			"Cidade Baixa", "567890123", "567.890.123-44", "1995-12-25", 720.0);
		
		PrestadorServico prestador1 = new PrestadorServico(null, "Carlos Souza", "Masculino", "Eletricista", 
			"carlos.souza@gmail.com", 11, "987654321", "Rua dos Pinheiros, 12", "São Paulo", "SP", "Casa", 
			"12345987", "123456789", "123.456.789-00", "1980-01-01", 4.8);
		PrestadorServico prestador2 = new PrestadorServico(null, "Fernando Almeida", "Masculino", "Encanador", 
			"fernando.almeida@gmail.com", 21, "998765432", "Rua da Luz, 34", "Rio de Janeiro", "RJ", "Apto 1", 
			"87654321", "234567890", "234.567.890-11", "1975-02-02", 4.6);
		PrestadorServico prestador3 = new PrestadorServico(null, "Juliana Braga", "Feminino", "Pintora", 
			"juliana.braga@gmail.com", 31, "987654321", "Av. Paulista, 56", "Belo Horizonte", "MG", "Bloco A", 
			"65432198", "345678901", "345.678.901-22", "1990-03-03", 4.9);
		PrestadorServico prestador4 = new PrestadorServico(null, "Paulo Ramos", "Masculino", "Marceneiro", 
			"paulo.ramos@gmail.com", 41, "998765432", "Rua da Paz, 78", "Curitiba", "PR", "Casa", "87654312", 
			"456789012", "456.789.012-33", "1983-04-04", 4.7);
		PrestadorServico prestador5 = new PrestadorServico(null, "Sandra Lima", "Feminino", "Jardineira", 
			"sandra.lima@gmail.com", 51, "987654321", "Rua das Acácias, 90", "Porto Alegre", "RS", "Casa", 
			"54321678", "567890123", "567.890.123-44", "1987-05-05", 4.5);
		
		Servico servico1 = new Servico(null, cliente1, prestador1, "Instalação elétrica", LocalDate.of(2024, 11, 10), 
			250.0, 30.0, 10.0, 4.8, "Excelente trabalho", "Rua das Flores, 123", 101, "São Paulo", "SP", 
			"Apto 101", "12345678", "Eletricidade", Timestamp.valueOf("2024-11-10 08:00:00"), 
			Timestamp.valueOf("2024-11-10 10:00:00"), Timestamp.valueOf("2024-11-10 02:00:00"));

		Servico servico2 = new Servico(null, cliente2, prestador2, "Desentupimento de pia", LocalDate.of(2024, 11, 11), 
			150.0, 20.0, 8.0, 4.6, "Rápido e eficiente", "Av. Brasil, 456", 456, "Rio de Janeiro", "RJ", 
			"Casa", "87654321", "Encanamento", Timestamp.valueOf("2024-11-11 09:00:00"), 
			Timestamp.valueOf("2024-11-11 10:30:00"), Timestamp.valueOf("2024-11-11 01:30:00"));

		Servico servico3 = new Servico(null, cliente3, prestador3, "Pintura de quarto", LocalDate.of(2024, 11, 12), 
			500.0, 50.0, 15.0, 4.9, "Muito caprichosa", "Rua das Palmeiras, 789", 789, "Belo Horizonte", "MG", 
			"Bloco B", "65432198", "Pintura", Timestamp.valueOf("2024-11-12 08:00:00"), 
			Timestamp.valueOf("2024-11-12 12:00:00"), Timestamp.valueOf("2024-11-12 04:00:00"));

		Servico servico4 = new Servico(null, cliente4, prestador4, "Montagem de móveis", LocalDate.of(2024, 11, 13), 
			300.0, 35.0, 12.0, 4.7, "Muito atencioso", "Av. das Nações, 101", 101, "Curitiba", "PR", 
			"Apto 202", "87654312", "Montagem", Timestamp.valueOf("2024-11-13 13:00:00"), 
			Timestamp.valueOf("2024-11-13 15:30:00"), Timestamp.valueOf("2024-11-13 02:30:00"));

		Servico servico5 = new Servico(null, cliente5, prestador5, "Manutenção de jardim", LocalDate.of(2024, 11, 14), 
			200.0, 25.0, 10.0, 4.5, "Excelente trabalho no jardim", "Rua do Comércio, 111", 111, "Porto Alegre", 
			"RS", "Casa", "54321678", "Jardinagem", Timestamp.valueOf("2024-11-14 08:00:00"), 
			Timestamp.valueOf("2024-11-14 10:00:00"), Timestamp.valueOf("2024-11-14 02:00:00"));
		
		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2, cliente3, cliente4, cliente5));
		prestadorServicoRepository.saveAll(Arrays.asList(prestador1, prestador2, prestador3, prestador4, prestador5));
		servicoRepository.saveAll(Arrays.asList(servico1, servico2, servico3, servico4, servico5));
		
	}
	
}
