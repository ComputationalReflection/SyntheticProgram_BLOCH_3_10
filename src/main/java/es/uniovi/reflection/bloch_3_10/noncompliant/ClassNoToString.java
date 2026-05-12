package es.uniovi.reflection.bloch_3_10.noncompliant;

public class ClassNoToString {
    int a;
    String name;

    public String tostring() {
        return name + "\t" + a;
    }
}
