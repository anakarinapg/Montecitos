package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conex {
    //atributos
    private static final String bbdd="jdbc:mysql://localhost:3306/bdguia";
    private static final String user="root";
    private static final String password="Iuo@fgDDemX5uk!";
    private static Connection con;

    public static Connection conectar(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(bbdd, user, password);
        System.out.println("Conexión Exitosa");
    }catch(Exception e){
    
        System.out.println("Error de conexión a la base de datos "+e.getMessage().toString());	
    
    }
    return con;
    }
    //prueba
    public static void main(String[] args) {
        Conex.conectar();
    }
}
