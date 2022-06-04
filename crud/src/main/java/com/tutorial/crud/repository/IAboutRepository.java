package com.tutorial.crud.repository;


import com.tutorial.crud.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAboutRepository extends JpaRepository<About, Integer> {
  
}
