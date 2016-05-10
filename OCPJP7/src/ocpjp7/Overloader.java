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
public class Overloader {
    public static void foo(Integer i) { System.out.println("foo(Integer)"); }
    public static void foo(short i) { System.out.println("foo(short)"); }
    public static void foo(long i) { System.out.println("foo(long)"); }
    public static void foo(int ... i) { System.out.println("foo(int ...)"); }
    public static void main(String []args) {
        foo(10);
    }
    
    /*
    a) foo(Integer)
b) foo(short)
c) foo(long)
d) foo(int ...)
    
    my answer
    C)
    result
    
    */
}
