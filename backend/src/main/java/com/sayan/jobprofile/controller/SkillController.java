package com.sayan.jobprofile.controller;

import com.sayan.jobprofile.model.Skill;
import com.sayan.jobprofile.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/skills")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @GetMapping
    public List<Skill> getAll() {
        return skillService.getAllSkills();
    }

    @PostMapping
    public Skill create(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }
}
