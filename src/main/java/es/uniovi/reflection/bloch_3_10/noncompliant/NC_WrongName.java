package es.uniovi.reflection.bloch_3_10.noncompliant;
// File: NC_WrongReturnType.java
public class NC_WrongName {

    // No es override
    public String tostring() {
        return "NC";
    }

    public void test() {
        System.out.println(this);
    }
}
