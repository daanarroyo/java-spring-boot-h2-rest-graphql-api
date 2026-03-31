package com.example.catalog.repository;

import com.example.catalog.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio JPA para acceder a la tabla products.
 *
 * Spring Data JPA genera automáticamente las operaciones básicas CRUD.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String description);
}
