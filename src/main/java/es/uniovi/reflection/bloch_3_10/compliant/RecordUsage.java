package es.uniovi.reflection.bloch_3_10.compliant;
// File: RecordUsage.java
public class RecordUsage {
    public void test() {
        ToStringRecord r = new ToStringRecord(1, 2);
        System.out.println(r); // implícito
    }
}
