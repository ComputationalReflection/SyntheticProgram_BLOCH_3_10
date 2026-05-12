package es.uniovi.reflection.bloch_3_10.noncompliant;
// File: NonCompliantConcatenation.java
public class NonCompliantConcatenation {

    public void test() {
        String s = "value=" + this; // implícito
    }
}
