package es.uniovi.reflection.bloch_3_10.noncompliant;

import static es.uniovi.reflection.bloch_3_10.noncompliant.EnumNoToString.A;

public class Main {

    public static void main(String[] args){
        A.toString();
        m().toString();
    }

    public static ClassReturned m(){
        return new ClassReturned();
    }
}
