package com.tutorial.crud.service;


import com.tutorial.crud.entity.Project;
import java.util.List;

public interface IProjectService {
    
    public List<Project> verProjects ();
    
    public void crearProject (Project Projec);
    
    public void borrarProject (int id);
    
    public Project buscarProject (int id);
    
}
