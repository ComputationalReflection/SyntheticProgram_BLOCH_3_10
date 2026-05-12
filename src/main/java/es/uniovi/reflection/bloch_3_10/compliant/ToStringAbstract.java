package es.uniovi.reflection.bloch_3_10.compliant;

public abstract class ToStringAbstract {


public void m(){
    System.out.println(this.toString());
    ToStringInt i = null;
    ToStringRecord r = new ToStringRecord(25, this);
    System.out.println(i.toString() +"\t" + r.toString());

}
}
