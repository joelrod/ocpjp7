/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocpjp7;

/**
 *
 * @author jorodriguez
 */
public class NullInstanceof {

    public static void main(String[] args) {
        String str = null;
        if (str instanceof Object) // NULLCHK
        {
            System.out.println("str is Object");
        } else {
            System.out.println("str is not Object");
        }
    }
    
    /*
    Which one of the following options correctly describes the behavior of this program?
a) This program will result in a compiler error in line marked with comment NULLCHK.
b) This program will result in a NullPointerException in line marked with comment NULLCHK.
c) When executed, this program will print the following: str is Object.
d) When executed, this program will print the following: str is not Object.
    
    my answer
    b
    
    Result
    str is not Object
    */
}
