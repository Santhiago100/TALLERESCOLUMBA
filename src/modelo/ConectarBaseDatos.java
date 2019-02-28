/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * CLIENTE SERVIDOR
 * Santiago Columba
 * Sexto Sistemas
 */
public class ConectarBaseDatos {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/tallerescolumba","root","");
        } catch (ClassNotFoundException e) {
            System.out.print(e.getMessage());
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
}
