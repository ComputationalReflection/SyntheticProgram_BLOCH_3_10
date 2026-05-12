package es.uniovi.reflection.bloch_3_10.noncompliant;
// File: NC_StringFormat.java
public class NC_StringAdd {

    public String test() {
        String s = "Class String";
        return s + this;
    }
}
