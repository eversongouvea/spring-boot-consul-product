package br.com.microservices.produtos.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservices.produtos.dto.ProductDTO;
import br.com.microservices.produtos.dto.ProductMapper;
import br.com.microservices.produtos.model.Product;

@RestController
@RequestMapping(value = "product")
public class ProductController {

	@GetMapping
	public ProductDTO product() {
		
		return ProductMapper.INSTANCE.productToProductDTO(new Product("Fone","Modelo plug",15.00,50));
		
	}
	
	@GetMapping(path = "/desction")
	public String stores() {
		
		return "Fone bluetooth samsung";
		
	}
	
}
