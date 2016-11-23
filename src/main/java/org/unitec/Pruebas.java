/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pruebas {
    @Id
    @GeneratedValue
    
    private Long id;
    private String nombre;
    private String edad;

    public Pruebas() {
    }

    public Pruebas(Long id) {
        this.id = id;
    }

    public Pruebas(String nombre) {
        this.nombre = nombre;
    }

    public Pruebas(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Pruebas(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Pruebas(Long id, String nombre, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
}
