package com.example.catalog.mapper;

import com.example.catalog.dto.ProductRequestDto;
import com.example.catalog.dto.ProductResponseDto;
import com.example.catalog.entity.Product;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

/**
 * Esta clase convierte entre DTOs y entidades.
 *
 * Tener un mapper separado ayuda a mantener limpia la lógica de negocio.
 */
@Component
public class ProductMapper {

    public Product toEntity(ProductRequestDto requestDto) {
        Product product = new Product();
        product.setName(requestDto.getName());
        product.setDescription(requestDto.getDescription());
        product.setPrice(requestDto.getPrice());
        product.setStock(requestDto.getStock());
        product.setCreatedAt(LocalDateTime.now());
        product.setUpdatedAt(LocalDateTime.now());
        return product;
    }

    public void updateEntity(Product product, ProductRequestDto requestDto) {
        product.setName(requestDto.getName());
        product.setDescription(requestDto.getDescription());
        product.setPrice(requestDto.getPrice());
        product.setStock(requestDto.getStock());
        product.setUpdatedAt(LocalDateTime.now());
    }

    public ProductResponseDto toResponse(Product product) {
        ProductResponseDto responseDto = new ProductResponseDto();
        responseDto.setId(product.getId());
        responseDto.setName(product.getName());
        responseDto.setDescription(product.getDescription());
        responseDto.setPrice(product.getPrice());
        responseDto.setStock(product.getStock());
        responseDto.setCreatedAt(product.getCreatedAt());
        responseDto.setUpdatedAt(product.getUpdatedAt());
        return responseDto;
    }
}
