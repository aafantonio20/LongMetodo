/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkglong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aafan
 */
public class Long {

     /**
     * @param tipoBD Tipo de la base de datos
     * @param nombreBD Nombre de la base de datos
     * @param sentenciaSQL Sentencia SQL a ejecutar
     */
    public static void main(String[] args) throws SQLException {
         String tipoBD = args[0];
        String nombreBD = args[1];
        String sentenciaSQL = args[2];
        
        System.out.println("TipoBD:" + tipoBD);
        System.out.println("sentenciaSQL:" + sentenciaSQL);
        
        Conexion conexion = new Conexion();
        conexion.hacerConexion(nombreBD);
        conexion.ejecutarConexion(tipoBD);
    }
    
}
