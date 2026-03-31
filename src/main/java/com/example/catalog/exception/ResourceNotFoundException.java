package com.example.catalog.exception;

/**
 * Excepción personalizada para cuando un recurso no existe.
 *
 * Ayuda a devolver un 404 claro y manejable desde la API.
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
