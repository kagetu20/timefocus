package com.timefocus.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener::class)
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "google_id", unique = true, nullable = false)
    val googleId: String,

    @Column(nullable = false)
    val email: String,

    @Column(name = "display_name", nullable = false)
    val displayName: String,

    @Column(name = "is_guest", nullable = false)
    val isGuest: Boolean = false,

    @Column(name = "google_access_token", columnDefinition = "TEXT")
    val googleAccessToken: String? = null,

    @Column(name = "google_refresh_token", columnDefinition = "TEXT")
    val googleRefreshToken: String? = null,

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    val createdAt: LocalDateTime = LocalDateTime.now()
)