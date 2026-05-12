package es.uniovi.reflection.bloch_3_10.noncompliant;

import es.uniovi.reflection.bloch_3_10.compliant.B1;
import es.uniovi.reflection.bloch_3_10.compliant.B2;

class B3 {
	
	private int a = 2;
	private int b = 2;
	private int c = 2;
	
	public String ab() {
		B1 var = new B1();
		B2 var2 = new B2();
		return var.toString()
                + var2.toString()
                + toString()
                + this.toString()
				+ new ClassNoToString().toString();
	}
}
