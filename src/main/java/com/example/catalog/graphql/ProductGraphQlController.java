package com.example.catalog.graphql;

import com.example.catalog.dto.ProductResponseDto;
import com.example.catalog.service.ProductService;
import java.util.List;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * Controlador GraphQL para búsquedas más flexibles.
 *
 * En este ejemplo se agrega un query de búsqueda por palabra clave.
 */
@Controller
public class ProductGraphQlController {

    private final ProductService productService;

    public ProductGraphQlController(ProductService productService) {
        this.productService = productService;
    }

    @QueryMapping
    public List<ProductResponseDto> searchProducts(@Argument String keyword) {
        return productService.searchProducts(keyword);
    }
}
