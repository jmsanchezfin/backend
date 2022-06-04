package com.tutorial.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)       
    private int id;
    
    private String logo_url;
    private String titulo;
    private String institucion;
    private int anio_inicio;
    private int anio_fin;

    public Education() {
    }

    public Education(int id, String logo_url, String titulo, String institucion, int anio_inicio, int anio_fin) {
        this.id = id;
        this.logo_url = logo_url;
        this.titulo = titulo;
        this.institucion = institucion;
        this.anio_inicio = anio_inicio;
        this.anio_fin = anio_fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getAnio_inicio() {
        return anio_inicio;
    }

    public void setAnio_inicio(int anio_inicio) {
        this.anio_inicio = anio_inicio;
    }

    public int getAnio_fin() {
        return anio_fin;
    }

    public void setAnio_fin(int anio_fin) {
        this.anio_fin = anio_fin;
    }
    
    
    
    
}
