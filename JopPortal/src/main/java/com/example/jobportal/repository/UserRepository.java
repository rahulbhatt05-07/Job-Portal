package com.example.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jobportal.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
}
