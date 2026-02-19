package com.sayan.jobprofile.controller;

import com.sayan.jobprofile.model.Profile;
import com.sayan.jobprofile.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.io.File;
import java.io.IOException;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping
    public List<Profile> getAll() {
        return profileService.getAllProfiles();
    }

    @PostMapping
    public Profile create(@RequestBody Profile profile) {
        return profileService.saveProfile(profile);
    }

    @PostMapping("/upload/{id}")
    public String uploadImage(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
        var profile = profileService.getById(id);
        String fileName = "profile_" + id + "_" + file.getOriginalFilename();
        String path = "uploads/" + fileName;

        File uploadDir = new File("uploads");
        if (!uploadDir.exists()) uploadDir.mkdir();

        file.transferTo(new File(path));
        profile.setImagePath(path);
        profileService.saveProfile(profile);
        return "Image uploaded successfully";
    }
}
