package com.sayan.jobprofile.controller;

import com.sayan.jobprofile.model.User;
import com.sayan.jobprofile.repository.UserRepository;
import com.sayan.jobprofile.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository repo;
    private final PasswordEncoder encoder;
    private final JwtUtil jwtUtil;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        repo.save(user);
        return "User registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        var dbUser = repo.findByUsername(user.getUsername())
                .orElseThrow();
        if (encoder.matches(user.getPassword(), dbUser.getPassword())) {
            return jwtUtil.generateToken(user.getUsername());
        } else {
            throw new RuntimeException("Invalid password");
        }
    }
}
