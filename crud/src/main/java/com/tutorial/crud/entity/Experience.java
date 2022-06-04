package com.tutorial.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String cargo;
    private String empresa;
    private String mes_inicio;
    private int anio_inicio;
    private String mes_fin;
    private int anio_fin;
    
    @Column(length=1000)
    private String descripcion;

    public Experience() {
    }

    public Experience(int id, String cargo, String empresa, String mes_inicio, int anio_inicio, String mes_fin, int anio_fin, String descripcion) {
        this.id = id;
        this.cargo = cargo;
        this.empresa = empresa;
        this.mes_inicio = mes_inicio;
        this.anio_inicio = anio_inicio;
        this.mes_fin = mes_fin;
        this.anio_fin = anio_fin;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getMes_inicio() {
        return mes_inicio;
    }

    public void setMes_inicio(String mes_inicio) {
        this.mes_inicio = mes_inicio;
    }

    public int getAnio_inicio() {
        return anio_inicio;
    }

    public void setAnio_inicio(int anio_inicio) {
        this.anio_inicio = anio_inicio;
    }

    public String getMes_fin() {
        return mes_fin;
    }

    public void setMes_fin(String mes_fin) {
        this.mes_fin = mes_fin;
    }

    public int getAnio_fin() {
        return anio_fin;
    }

    public void setAnio_fin(int anio_fin) {
        this.anio_fin = anio_fin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
