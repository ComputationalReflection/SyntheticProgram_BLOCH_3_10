package es.uniovi.reflection.bloch_3_10.noncompliant;

public class Usages {

    private NC_StringValueOf getter(){
        return new NC_StringValueOf();
    }
    private static NC_Println nc = new NC_Println();
    public String res;
    public void prettyPrint(NC_PlusEquals arg) {
        StringBuilder sb = new StringBuilder();
        sb.append(new NC_StringBuilderAppend());
        System.out.println(nc);
        String aux = String.valueOf(getter());
        res += aux;
        res += arg;
    }
}
