package com.sayan.jobprofile.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;

    private String name;
    private String proficiency; // e.g., Beginner, Intermediate, Expert
}
