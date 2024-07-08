/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author muril
 */
public class FabricaConexao {
    public static Connection getConexao() throws SQLException , ClassNotFoundException {
        //MySQL
        // O método forName carrega e inicia o driver passado por parâmetro
        Class.forName("com.mysql.cj.jdbc.Driver");
        String URL = "jdbc:mysql://localhost:3306/sistema";
        String USER = "root";
        String PASSWORD = "";
        // Estabelecendo a conexão
        
        return DriverManager.getConnection( URL, USER, PASSWORD);
    }
}
