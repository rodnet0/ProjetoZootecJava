/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufra.edu.br.projeto_nap2_poo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RODRIGO
 */
public class FactoryConnection {
    private static Connection connection;
    private static final String URL_CONNECTION = "jdbc:mysql://localhost/projeto_nap2_poo";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        if(connection == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(URL_CONNECTION, USER, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(FactoryConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FactoryConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
  public static void closeConnection(){
      if(connection!=null){
          try {
              connection.close();
              connection = null;
          } catch (SQLException ex) {
              Logger.getLogger(FactoryConnection.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
  }
}
