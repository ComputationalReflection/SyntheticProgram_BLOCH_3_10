package es.uniovi.reflection.bloch_3_10.compliant;
// File: CompliantEnum.java
public enum CompliantEnum {
    A, B;

    @Override
    public String toString() {
        return "Enum value: " + name();
    }
}
