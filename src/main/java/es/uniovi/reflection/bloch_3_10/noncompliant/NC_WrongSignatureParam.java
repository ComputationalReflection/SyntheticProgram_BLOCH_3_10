package es.uniovi.reflection.bloch_3_10.noncompliant;
// File: NC_WrongSignatureParam.java
public class NC_WrongSignatureParam {

    // NO sobrescribe Object.toString()
    public String toString(String prefix) {
        return prefix + "NC";
    }

    public void test() {
        System.out.println(this);
    }
}
