package es.uniovi.reflection.bloch_3_10.noncompliant;

public class NC_BaseWithoutToString {
    private int age;

    public String print(){
        return String.format("Age%d", age);
    }
}
