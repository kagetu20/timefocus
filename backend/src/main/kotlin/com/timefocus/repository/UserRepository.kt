package com.timefocus.repository

import com.timefocus.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {

    fun findByGoogleId(googleId: String): User?

    fun findByEmail(email: String): User?
}