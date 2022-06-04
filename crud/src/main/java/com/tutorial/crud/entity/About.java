package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String nombre;
    private String apellido;
    private String posicion;
    private String cv_card_url;
    private String banner_url;
    
    @Column(length=1000)
    private String acerca_de;

    public About() {
    }

    public About(int id, String nombre, String apellido, String posicion, String cv_card_url, String banner_url, String acerca_de) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.cv_card_url = cv_card_url;
        this.banner_url = banner_url;
        this.acerca_de = acerca_de;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getCv_card_url() {
        return cv_card_url;
    }

    public void setCv_card_url(String cv_card_url) {
        this.cv_card_url = cv_card_url;
    }

    public String getBanner_url() {
        return banner_url;
    }

    public void setBanner_url(String banner_url) {
        this.banner_url = banner_url;
    }

    public String getAcerca_de() {
        return acerca_de;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }
    
    
    
}
