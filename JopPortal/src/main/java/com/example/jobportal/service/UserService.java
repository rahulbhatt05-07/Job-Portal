package com.example.jobportal.service;

import com.example.jobportal.entity.User;
import com.example.jobportal.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public String register(User user) {
        User exists = userRepo.findByEmail(user.getEmail());
        if (exists != null)
            return "Email already registered!";
        userRepo.save(user);
        return "User registered successfully!";
    }

    public String login(String email, String password) {
        User u = userRepo.findByEmailAndPassword(email, password);
        return (u != null) ? "Login successful!" : "Invalid email or password!";
    }
}
