package com.sayan.jobprofile.repository;

import com.sayan.jobprofile.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
