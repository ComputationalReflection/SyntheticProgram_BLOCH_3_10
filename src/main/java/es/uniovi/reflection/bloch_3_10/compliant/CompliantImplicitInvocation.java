package es.uniovi.reflection.bloch_3_10.compliant;
// File: CompliantImplicitInvocation.java
public class CompliantImplicitInvocation {

    @Override
    public String toString() {
        return "Implicit OK";
    }

    public void test() {
        System.out.println(this); // implícito
    }
}
