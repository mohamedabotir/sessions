/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Threading
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Account data=new Account();
       
       file f=new file();
       data.setID(24);
       data.setBalance(2601.5);
       data.setName("Mohamed");
       data.setPincode(23325);
       String record=data.getId()+" "+data.getName()+" "+data.getBalance()+"\n";
       f.openFile(record);
       f.Close();
      
    }
    
}
