package com.example.catalog.config;

import com.example.catalog.entity.Product;
import com.example.catalog.repository.ProductRepository;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Carga datos de ejemplo al arrancar la app si la tabla está vacía.
 *
 * Esto sirve para probar rápido el CRUD y la búsqueda GraphQL.
 */
@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner loadSampleData(ProductRepository productRepository) {
        return args -> {
            if (productRepository.count() == 0) {
                Product keyboard = new Product();
                keyboard.setName("Mechanical Keyboard");
                keyboard.setDescription("RGB mechanical keyboard for developers");
                keyboard.setPrice(new BigDecimal("89.99"));
                keyboard.setStock(25);
                keyboard.setCreatedAt(LocalDateTime.now());
                keyboard.setUpdatedAt(LocalDateTime.now());

                Product mouse = new Product();
                mouse.setName("Wireless Mouse");
                mouse.setDescription("Ergonomic mouse for office and gaming");
                mouse.setPrice(new BigDecimal("39.50"));
                mouse.setStock(40);
                mouse.setCreatedAt(LocalDateTime.now());
                mouse.setUpdatedAt(LocalDateTime.now());

                productRepository.save(keyboard);
                productRepository.save(mouse);
            }
        };
    }
}
