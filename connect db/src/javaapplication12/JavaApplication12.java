/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Threading
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        db connect=new db();
        Connection co;
        try {
            co=connect.getConnect();
        } catch (SQLException ex) {
            Logger.getLogger(JavaApplication12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
