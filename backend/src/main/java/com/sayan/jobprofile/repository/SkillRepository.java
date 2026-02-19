package com.sayan.jobprofile.repository;

import com.sayan.jobprofile.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
