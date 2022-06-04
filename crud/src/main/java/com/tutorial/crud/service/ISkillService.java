package com.tutorial.crud.service;


import com.tutorial.crud.entity.Skill;
import java.util.List;

public interface ISkillService {
    
    public List<Skill> verSkills ();
    
    public void crearSkill (Skill Skil);
    
    public void borrarSkill (int id);
    
    public Skill buscarSkill (int id);
    
}
