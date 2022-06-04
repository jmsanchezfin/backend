package com.tutorial.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String titulo;
    private int nivel;
    private int nivel_maximo;
    private String descripcion_nivel;

    public Skill() {
    }

    public Skill(int id, String titulo, int nivel, int nivel_maximo, String descripcion_nivel) {
        this.id = id;
        this.titulo = titulo;
        this.nivel = nivel;
        this.nivel_maximo = nivel_maximo;
        this.descripcion_nivel = descripcion_nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel_maximo() {
        return nivel_maximo;
    }

    public void setNivel_maximo(int nivel_maximo) {
        this.nivel_maximo = nivel_maximo;
    }

    public String getDescripcion_nivel() {
        return descripcion_nivel;
    }

    public void setDescripcion_nivel(String descripcion_nivel) {
        this.descripcion_nivel = descripcion_nivel;
    }
    
}
