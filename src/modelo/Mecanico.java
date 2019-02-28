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
public class Mecanico extends Persona implements InterfaceMecanico{
    String telf, direc, cargo;

    public Mecanico(String cedula, String nombre, String apellido, String edad, String telf, String direc, String cargo) {
        super(cedula, nombre, apellido, edad);
        this.telf = telf;
        this.direc = direc;
        this.cargo = cargo;
    }
    @Override
    public void imprimirValores() {
        System.out.println("Interface Repuestos Taalleres Ronson");
        System.out.println("Cédula: "+cedula+", Nombre: "+nombre+", Apellido: "+apellido+", Edad: "+edad+", Teléfono: "+telf
        +", Dirección: "+direc+", Cargo:"+cargo);
    }
    @Override
    public void imprimir_mostrat(){
        imprimirValores();
    }
    
}
