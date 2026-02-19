package com.sayan.jobprofile.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;
    private String imagePath;
    private String name;
    private String title;
    private String summary;
}
