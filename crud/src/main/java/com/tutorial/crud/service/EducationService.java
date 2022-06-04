package com.tutorial.crud.service;

import com.tutorial.crud.entity.Education;
import com.tutorial.crud.repository.IEducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService {

    @Autowired
    public IEducationRepository educationRepository;
    
    @Override
    public List<Education> verEducations() {
        return educationRepository.findAll();
    }

    @Override
    public void crearEducation(Education Educatio) {
        educationRepository.save(Educatio);
    }

    @Override
    public void borrarEducation(int id) {
        educationRepository.deleteById(id);
    }

    @Override
    public Education buscarEducation(int id) {
        return educationRepository.findById(id)
                .orElse(null);
    }
    
    
    
}
