package com.wedding.wedding_backend.repository;

import com.wedding.wedding_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findByPhoneNumber(String phoneNumber);
}
