package com.sayan.jobprofile.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="End_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;

    private String role; // ROLE_USER or ROLE_ADMIN
}
