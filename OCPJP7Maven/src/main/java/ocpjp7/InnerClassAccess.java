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
public class InnerClassAccess {

    public static void main(String[] args) {
        
        System.out.println(new Outer.Inner().text);       
                
    }
}

class Outer {

     static class Inner {

        public final String text = "Inner";

    }
}

/*
Which one of the following expressions when replaced for the text in place
of the comment *CODE HERE+ will
print the output “Inner” in console?

a) new Outer.Inner().text
b) Outer.new Inner().text
c) Outer.Inner.text
d) new Outer().Inner.text
*/

/*

My answer:
Outer.Inner.text

Result :
   
System.out.println(new Outer.Inner().text);

*/