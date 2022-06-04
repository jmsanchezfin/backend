package com.tutorial.crud.service;


import com.tutorial.crud.entity.About;
import java.util.List;

public interface IAboutService {
    
    public List<About> verAbouts ();
    
    public void crearAbout (About abou);
    
    public void borrarAbout (int id);
    
    public About buscarAbout (int id);
    
}
