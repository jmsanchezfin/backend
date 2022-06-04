package com.tutorial.crud.service;

import com.tutorial.crud.entity.Experience;
import com.tutorial.crud.repository.IExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService implements IExperienceService {

    @Autowired
    public IExperienceRepository experienceRepository;
    
    @Override
    public List<Experience> verExperiences() {
        return experienceRepository.findAll();
    }

    @Override
    public void crearExperience(Experience Experienc) {
        experienceRepository.save(Experienc);
    }

    @Override
    public void borrarExperience(int id) {
        experienceRepository.deleteById(id);
    }

    @Override
    public Experience buscarExperience(int id) {
        return experienceRepository.findById(id)
                .orElse(null);
    }
    
}
