package com.example.catalog.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
import java.time.LocalDate;

public class Profile {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "first_name", columnDefinition = "varbinary(800)")
    private byte[] firstName;

    @Column(name = "last_name", columnDefinition = "varbinary(800)")
    private byte[] lastName;

    @Column(name = "phone", length = 50)
    private String phone;

    @Column(name = "tax_id", length = 80)
    private String taxId;

    @Column(name = "sex")
    private Character sex;

    @Column(name = "photo", length = 150)
    private String photo;

    @Column(name = "birthdate")
    private LocalDate birthdate;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;











}
