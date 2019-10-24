package br.com.microservices.produtos.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.microservices.produtos.dto.ProductDTO;
import br.com.microservices.produtos.model.Product;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );
	
	ProductDTO productToProductDTO(Product product); 

}
