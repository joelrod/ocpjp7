/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

/**
 *
 * @author jorodriguez
 */
public class Base {

    public static void foo(Base bObj) {
        System.out.println("In Base.foo()");
        bObj.bar();
    }

    public void bar() {
        System.out.println("In Base.bar()");
    }
}

class Derived extends Base {

    public static void foo(Base bObj) {
        System.out.println("In Derived.foo()");
        bObj.bar();
    }

    public void bar() {
        System.out.println("In Derived.bar()");
    }
}

class OverrideTest {

    public static void main(String[] args) {
        Base bObj = new Derived();
        bObj.foo(bObj);
    }
}

/*
 a)
 In Base.foo()
 In Base.bar()
 b)
 In Base.foo()
 In Derived.bar()
 c)
 In Derived.foo()
 In Base.bar()
 d)
 In Derived.foo()
 In Derived.bar()

 my answer :

 B)


result


 */
