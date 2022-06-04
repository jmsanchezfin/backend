package com.tutorial.crud.service;

import com.tutorial.crud.entity.Project;
import com.tutorial.crud.repository.IProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {

    @Autowired
    public IProjectRepository projectRepository;
    
    @Override
    public List<Project> verProjects() {
        return projectRepository.findAll();
    }

    @Override
    public void crearProject(Project Projec) {
        projectRepository.save(Projec);
    }

    @Override
    public void borrarProject(int id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project buscarProject(int id) {
        return projectRepository.findById(id)
                .orElse(null);
    }
    
}
