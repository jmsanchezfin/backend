package com.tutorial.crud.repository;


import com.tutorial.crud.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProjectRepository extends JpaRepository<Project, Integer> {
    
    
}
