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
		Product p1 = new Product(null, "Açaí Frooty 2L", "Açaí Natural Frooty Pote 2 Litros", 38.5, "https://www.paodeacucar.com/img/uploads/1/154/615154.png", "1039326");
		Product p2 = new Product(null, "Picanha aturatta 900g", "Picanha Resfriada Maturatta FRIBOI Peça 900g", 71.0, "https://www.paodeacucar.com/img/uploads/1/777/518777.jpg", "0049009");
		Product p3 = new Product(null, "Heineken 350ml", "Cerveja Heineken Lata 350ml", 3.49, "", "0790642");
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
	}
	
}