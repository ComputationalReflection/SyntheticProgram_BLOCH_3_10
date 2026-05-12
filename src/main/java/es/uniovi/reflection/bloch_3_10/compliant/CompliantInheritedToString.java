package es.uniovi.reflection.bloch_3_10.compliant;
// File: CompliantInheritedToString.java
public class CompliantInheritedToString extends BaseWithToString {

    public void test() {
        System.out.println(this); // usa BaseWithToString.toString()
    }
}
