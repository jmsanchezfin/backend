package com.tutorial.crud.repository;


import com.tutorial.crud.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducationRepository extends JpaRepository<Education, Integer> {
    
    
}
