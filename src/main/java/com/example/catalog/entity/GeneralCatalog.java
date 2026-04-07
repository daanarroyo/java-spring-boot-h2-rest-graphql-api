package com.example.catalog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;


@Setter
@Getter
@Entity
@Table(name = "general_catalog")
public class GeneralCatalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "`group`", nullable = false)
    private String group;

    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "`key`")
    private String key;

    @Column(name = "value")
    private String value;

    @Column(name = "`default`")
    private String defaultVal;

    @Column(name = "parent", columnDefinition = "int default 0")
    private Integer parent;

    @Column(name = "title")
    private String title;

    @Column(name = "internationalization_key")
    private String internationalizationKey;

    @Column(name = "description")
    private String description;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "deleted")
    private String deleted;

    @Column(name = "user_create")
    private String userCreate;

    @Column(name = "user_updated")
    private String userUpdated;

    @Column(name = "created_at", nullable = false, updatable = false,
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(name = "updated_at",
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;
}
