package com.sayan.jobprofile.service;

import com.sayan.jobprofile.model.Skill;
import com.sayan.jobprofile.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {

    private final SkillRepository skillRepository;

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }
}
