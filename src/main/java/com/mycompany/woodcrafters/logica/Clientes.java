package com.mycompany.woodcrafters.logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Clientes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private int documento;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    
  
    @OneToOne(cascade = CascadeType.PERSIST)
    private Usuarios unUsuario;

    public Clientes() {
    }

    public Clientes(int id, int documento, String nombre, String apellido, String direccion, int telefono, Usuarios unUsuario) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.unUsuario = unUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Usuarios getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuarios unUsuario) {
        this.unUsuario = unUsuario;
    }
    
    
    
    
    
    
}

