/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objectinstantiation;

/**
 *
 * @author bacag
 */
public class App {
    
    
    //All of our "MAINS" must be static
    //constants should also be static since it will never change
    public static void main(String[] args) {
        //Static method means you have to go in order..
        //will have to run line 16 before you can run line 18
        
        //instantiation - if I don't instantiate this, 
        //then I can't call it in the method
        //(Cancel this instatiation) --> Adder myAdder = new Adder();
        
        double myPi = Adder.PI;
        
        int sum = Adder.add(5, 4);
        
        System.out.println(myPi);
        
        System.out.println("The sum is: "+ sum); 
        
    }
}
