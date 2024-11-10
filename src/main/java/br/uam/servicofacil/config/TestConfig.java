package br.uam.servicofacil.config;

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
		
		Cliente c1 = new Cliente(null, "Rafael", "rafalegal@email.com");
		Cliente c2 = new Cliente(null, "Caio", "caiolegal@email.com");
		Cliente c3 = new Cliente(null, "Davy", "davylegal@email.com");
		Cliente c4 = new Cliente(null, "Henrique", "henriquelegal@email.com");
		Cliente c5 = new Cliente(null, "Leonardo", "leonardolegal@email.com");
		
		PrestadorServico p1 = new PrestadorServico(null, "Jorjao", "Pedreiro", "jorjaolegal@email.com");
		PrestadorServico p2 = new PrestadorServico(null, "Reginaldo", "Eletricista", "reginaldolegal@email.com");
		PrestadorServico p3 = new PrestadorServico(null, "Zezinho", "Marceneiro", "zezinholegal@email.com");
		
		Servico s1 = new Servico(null, c1, p2,  "Fazer os armarios da cozinha", LocalDate.of(2024, 3, 19)); 
		Servico s2 = new Servico(null, c3, p2,  "Fazer a mesa do excritorio", LocalDate.of(2024, 9, 10));
		Servico s3 = new Servico(null, c4, p2,  "Fazer a estante da sala", LocalDate.of(2024, 11, 9));
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5));
		prestadorServicoRepository.saveAll(Arrays.asList(p1, p2, p3));
		servicoRepository.saveAll(Arrays.asList(s1, s2, s3));
		
	}
	
}
