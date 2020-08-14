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
public class Account {
 private int  id,pincode;
    private String name;
    private double balance;
    public Account(){
    id=0;
    pincode=0000;
    name="";
    balance=0.0;
    }
    public int getId() {
        return id;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPincode() {
        return pincode;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
   
    public void  setID(int id){
    this.id=id;
    }
   
    
}
