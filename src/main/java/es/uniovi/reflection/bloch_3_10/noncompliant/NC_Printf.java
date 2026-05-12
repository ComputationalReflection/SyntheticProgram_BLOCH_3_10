package es.uniovi.reflection.bloch_3_10.noncompliant;

public class NC_Printf {
    private EnumNoToString e;
    private NC_Printf aux;


    public void test() {
        System.out.printf("obj=%s%n", aux);
    }
}
