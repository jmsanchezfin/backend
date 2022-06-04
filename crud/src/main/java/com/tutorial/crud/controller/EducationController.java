package com.tutorial.crud.controller;

import com.tutorial.crud.entity.Education;
import com.tutorial.crud.service.IEducationService;
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
public class EducationController {
    
    @Autowired
    private IEducationService educationService;
    
    @PostMapping ("/new/education")
    public void crearEducation (@RequestBody Education educatio) {
        educationService.crearEducation(educatio);
    }
    
    @GetMapping ("/list/education")
    @ResponseBody
    public List<Education> verEducation () {
        return educationService.verEducations();
    }
    
    @DeleteMapping ("/delete/education/{id}")
    public void borrarEducation (@PathVariable int id) {
        educationService.borrarEducation(id);
    }
}
