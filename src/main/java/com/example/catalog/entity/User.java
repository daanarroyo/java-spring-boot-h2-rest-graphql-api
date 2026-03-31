package com.example.catalog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;


@Setter
@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "platform", nullable = false)
    private Character platform;

    @Column(name = "method")
    private Character method;

    @Column(name = "terms_conditions")
    private Boolean termsConditions;

    @Column(name = "is_mailable", nullable = false)
    private Boolean isMailable = false;

    @Column(name = "is_migrated", nullable = false)
    private Boolean isMigrated = false;

    @Column(name = "is_contact", nullable = false)
    private Boolean isContact = false;

    @Column(name = "app_token", length = 100)
    private String appToken;

    @Column(name = "last_login", nullable = false)
    private Instant lastLogin;

    @Column(name = "user_version", length = 10)
    private String userVersion;

    @Column(name = "current_platform")
    private Character currentPlatform;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;


}
