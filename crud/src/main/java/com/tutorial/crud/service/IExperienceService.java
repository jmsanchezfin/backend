package com.tutorial.crud.service;


import com.tutorial.crud.entity.Experience;
import java.util.List;

public interface IExperienceService {
    
    public List<Experience> verExperiences ();
    
    public void crearExperience (Experience Experienc);
    
    public void borrarExperience (int id);
    
    public Experience buscarExperience (int id);
    
}
