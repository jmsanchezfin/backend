package com.tutorial.crud.controller;

import com.tutorial.crud.entity.Skill;
import com.tutorial.crud.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SkillController {
    
    @Autowired
    private ISkillService skillService;
    
    @PostMapping ("/new/skill")
    public void crearSkill (@RequestBody Skill skil) {
        skillService.crearSkill(skil);
    }
    
    @GetMapping ("/list/skill")
    @ResponseBody
    public List<Skill> verSkills () {
        return skillService.verSkills();
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void borrarSkill (@PathVariable int id) {
        skillService.borrarSkill(id);
    }
    
}
