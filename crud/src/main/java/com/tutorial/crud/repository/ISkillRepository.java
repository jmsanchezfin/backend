package com.tutorial.crud.repository;


import com.tutorial.crud.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillRepository extends JpaRepository<Skill, Integer> {
    
    
}
