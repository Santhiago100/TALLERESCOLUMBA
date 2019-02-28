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
public class Repuesto extends Producto implements InterfaceRepuesto{
    String cantidad, repuesto;

    public Repuesto(String codigo, String nombre, String cantidad, String repuesto) {
        super(nombre, codigo);
        this.cantidad = cantidad;
        this.repuesto = repuesto;
    }

    @Override
    public void imprimirValores() {
        System.out.println("Interface Repuestos Taalleres Ronson");
        System.out.println("Código: "+codigo+", Nombre: "+nombre+", Cantidad: "+cantidad+", Repuesto: "+repuesto);
    }
    @Override
    public void imprimir_mostrat(){
        imprimirValores();
    }
}
