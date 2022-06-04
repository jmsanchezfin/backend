package com.tutorial.crud.controller;

import com.tutorial.crud.entity.Experience;
import com.tutorial.crud.service.IExperienceService;
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
public class ExperienceController {
    
    @Autowired
    private IExperienceService experienceService;
    
    @PostMapping ("/new/experience")
    public void crearExperience (@RequestBody Experience experienc) {
        experienceService.crearExperience(experienc);
    }
    
    @GetMapping ("/list/experience")
    @ResponseBody
    public List<Experience> verExperience () {
        return experienceService.verExperiences();
    }
    
    @DeleteMapping ("/delete/experience/{id}")
    public void borrarExperience (@PathVariable int id) {
        experienceService.borrarExperience(id);
    }
}
