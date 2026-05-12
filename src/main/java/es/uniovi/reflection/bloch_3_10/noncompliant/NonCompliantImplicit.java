package es.uniovi.reflection.bloch_3_10.noncompliant;
// File: NonCompliantImplicit.java
public class NonCompliantImplicit {

    public void test() {
        System.out.println(this); // implícito → Object.toString()
    }
}
