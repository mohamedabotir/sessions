/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Threading
 */
public class file {
    BufferedWriter out;
    void openFile(String Value) 
    {
        try {
            out=new BufferedWriter(new FileWriter("Client.txt",true)); 
            
            out.write(Value);
        } catch (IOException ex) {
            Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
    }
    void Close(){
        
        try {
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(file.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
