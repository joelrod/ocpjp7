/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpjp7;

/**
 *
 * @author ihsa
 */
public class Increment {
    
    public static void main(String[] args){
        Integer i = 10;
        Integer j= 11;
        Integer k = ++i;
        
        System.out.println("k==j "+(k==j));
        System.out.println("k.equals(kj) "+(k.equals(j)));
        
        //personal 
        //k==j true
        //k.equals(j) true
        
        //java
        //k==j true
        //k.equals(j) true
         
    }
    
}
