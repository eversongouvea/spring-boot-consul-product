package br.com.microservices.produtos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.produtos.dto.ProductDTO;
import br.com.microservices.produtos.dto.mapper.ProductMapper;
import br.com.microservices.produtos.model.Product;

@RestController
@RequestMapping(value = "desction-product")
public class InitController {

	@GetMapping
	public ProductDTO init() {
		
		return ProductMapper.INSTANCE.productToProductDTO(new Product("Fone","Modelo plug",15.00,50));
		
	}
	
}
