package com.tutorial.crud.repository;


import com.tutorial.crud.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienceRepository extends JpaRepository<Experience, Integer> {
    
    
    
}
