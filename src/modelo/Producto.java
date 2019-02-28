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
public abstract class Producto {
    String codigo,nombre;

    public Producto(String codigo, String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    abstract public void imprimirValores();
}
