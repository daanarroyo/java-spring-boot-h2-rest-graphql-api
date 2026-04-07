package com.example.catalog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;



@Setter
@Getter
@Entity
@Table(name = "api_keys_by_client")
public class ApiKeysByClient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "key_value", nullable = false, length = 64)
    private String keyValue;

    @Column(name = "client", nullable = false, length = 30)
    private String client;

    @Column(name = "level_access", nullable = false)
    private Integer levelAccess;

    @Column(name = "active", nullable = false)
    private Byte active;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "user_created", length = 50)
    private String userCreated;

    @Column(name = "user_updated", length = 50)
    private String userUpdated;


}
