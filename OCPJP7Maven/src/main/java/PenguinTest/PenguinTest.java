/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenguinTest;

/**
 *
 * @author ihsa
 */
public class PenguinTest {

    public static void main(String[] args) {
        Penguin pingu = new Penguin();
        pingu.walk();
        pingu.fly();
    }
}

class CannotFlyException extends Exception {
}

interface Birdie {

    public abstract void fly() throws CannotFlyException;
}

interface Biped {

    public void walk();
}

abstract class NonFlyer {

    public void fly() {
        System.out.print("cannot fly ");
    } // LINE A
}

class Penguin extends NonFlyer implements Birdie, Biped { // LINE B

    public void walk() {
        System.out.print("walk ");
    }
    
       
}



/*

a) Compiler error in line with comment LINE A because fly() does not declare to throw CannotFlyException.
b) Compiler error in line with comment LINE B because fly() is not defined and hence need to declare it abstract.
c) It crashes after throwing the exception CannotFlyException.
d) When executed, the program prints “walk cannot fly”.

My answer:

d)

ok

*/