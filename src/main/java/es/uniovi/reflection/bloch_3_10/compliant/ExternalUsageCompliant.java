package es.uniovi.reflection.bloch_3_10.compliant;
// File: ExternalUsageCompliant.java
public class ExternalUsageCompliant {

    public void test() {
        CompliantOwnToString obj = new CompliantOwnToString();
        System.out.println(obj); // implícito
    }
}
