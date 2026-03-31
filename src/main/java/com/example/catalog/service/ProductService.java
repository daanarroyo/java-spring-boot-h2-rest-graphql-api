package com.example.catalog.service;

import com.example.catalog.dto.ProductRequestDto;
import com.example.catalog.dto.ProductResponseDto;
import java.util.List;

/**
 * Contrato de la capa de servicio.
 *
 * Esta capa concentra la lógica de negocio y evita que el controlador hable directo con el repositorio.
 */
public interface ProductService {

    ProductResponseDto createProduct(ProductRequestDto requestDto);

    List<ProductResponseDto> getAllProducts();

    ProductResponseDto getProductById(Long id);

    ProductResponseDto updateProduct(Long id, ProductRequestDto requestDto);

    void deleteProduct(Long id);

    List<ProductResponseDto> searchProducts(String keyword);
}
