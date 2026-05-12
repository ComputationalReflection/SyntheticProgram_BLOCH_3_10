package es.uniovi.reflection.bloch_3_10.compliant;
// File: AbstractIgnored.java
public abstract class AbstractIgnored {

    public void test() {
        System.out.println(this); // no evaluado por la regla
    }
}
