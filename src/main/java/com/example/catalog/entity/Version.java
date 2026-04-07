package com.example.catalog.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;


@Setter
@Getter
@Entity
@Table(name = "country")
public class Version {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "latest_version", nullable = false, length = 10)
    private String latestVersion;

    @Column(name = "device_type", nullable = false, length = 2)
    private String deviceType;

    @Column(name = "url", nullable = false, length = 100)
    private String url;

    @Column(name = "maintenance_mode", nullable = false)
    private Boolean maintenanceMode = false;

    @Column(name = "message_maintenance", length = 100)
    private String messageMaintenance;

    @Column(name = "message_update", length = 100)
    private String messageUpdate;

    @Column(name = "webview_url", length = 100)
    private String webviewUrl;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;
}
