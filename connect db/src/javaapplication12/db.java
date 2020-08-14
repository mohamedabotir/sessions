/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Threading
 */
public class db {
   final int port;
   final String name,servername,password,db;
    db(){
    port=3307;
    name="root";
    servername="localhost";
    password="Kampo";
    db="web";
    }
    Connection getConnect() throws SQLException{
    
    return DriverManager.getConnection("jdbc:mysql://"+servername+":"+port+"/"+db,name,password);
    }
    
}
