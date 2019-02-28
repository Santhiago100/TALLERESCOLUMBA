/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * CLIENTE SERVIDOR
 * Santiago Columba
 * Sexto Sistemas
 */
public abstract class Persona {
    String cedula, nombre, apellido, edad;

    public Persona(String cedula, String nombre, String apellido, String edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    abstract public void imprimirValores();
    
}
