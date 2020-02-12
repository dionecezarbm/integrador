package com.example.howmuch.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.howmuch.entities.Product;
import com.example.howmuch.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Product p4 = new Product(null, "PC Gamer", "Produto sem imagem", 2500.0, "", "123456");
		Product p1 = new Product(null, "Negresco", "Biscoito Recheado Negresco 140g", 1.5, "https://nagumonew.vteximg.com.br/arquivos/ids/191554-1000-1000/BISCOITO-TRADICIONAL-NEGRESCO-NESTLE-140G-866255_1.jpg", "7891000023808");
		Product p2 = new Product(null, "Club Social Crostini", "Club Social Crostini - Sabor original 20g", 1.0, "https://s3-sa-east-1.amazonaws.com/fz-imagens/wp-content/uploads/2018/04/12121916/Biscoito-Salgado-Sabor-Original-Crostini-Club-Social.jpeg", "7622210782281");
		Product p3 = new Product(null, "Desodorante Todo Dia", "Desodorante Natura Todo Dia 80g", 17.0, "https://static.carrefour.com.br/medias/sys_master/images/images/h7a/h4d/h00/h00/13157432426526.jpg", "7899846061442");
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
	}
	
}