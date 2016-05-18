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
public class StrEqual {

    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = new String("hi");
        String s3 = "hi";

        if (s1 == s2) {
            System.out.println("S1 and s2 Equal");
        } else {
            System.out.println("S1 and s2 Not Equal");
        }

        if (s1 == s3) {
            System.out.println("s1 and s3 Equal");
        } else {
            System.out.println("s1 and s3 not equal");
        }
    }
    
    //resultado personal
    //s1 and s2 not equal
    //s1 and s3 equal
    
    //resultado de java
    //Mismo

}
