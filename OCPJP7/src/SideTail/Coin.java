/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SideTail;

/**
 *
 * @author jorodriguez
 */
public class Coin {

    public static void overload(Head side) {
        System.out.print(side.getSide());
    }

    public static void overload(Tail side) {
        System.out.print(side.getSide());
    }

    public static void overload(Side side) {
        System.out.print("Side ");
    }

    public static void overload(Object side) {
        System.out.print("Object ");
    }

    public static void main(String[] args) {
        Side firstAttempt = new Head();
        Tail secondAttempt = new Tail();
        overload(firstAttempt);
        overload((Object) firstAttempt);
        overload(secondAttempt);
        overload((Side) secondAttempt);
    }

    /*
     a) Head Head Tail Tail
     b) Side Object Tail Side
     c) Head Object Tail Side
     d) Side Head Tail Side
    
    my answer
    a)
    
    result
    Side Object Tail Side 
    */
}
