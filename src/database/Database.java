/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class Database {
    private String url="jdbc:mysql://localhost:3306/mydb";
    private String username="root";
    private String password="";
    private Connection conn;
    
    public boolean connect() throws SQLException{
       conn=DriverManager.getConnection(url, username, password);
       return true;
    }
}
