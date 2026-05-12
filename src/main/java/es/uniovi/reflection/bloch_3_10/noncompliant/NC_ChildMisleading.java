package es.uniovi.reflection.bloch_3_10.noncompliant;
// File: NC_ChildMisleading.java
public class NC_ChildMisleading extends NC_BaseWithoutToString {

    public void test() {
        System.out.println(this);
    }
}
