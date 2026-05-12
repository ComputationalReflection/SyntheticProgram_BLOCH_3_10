package es.uniovi.reflection.bloch_3_10.compliant;

public class B2 {
	
	private int a = 2;
	private int b = 2;
	private int c = 2;

	@Override
	public String toString() {
		String cc = c+"";
		return a+" "+b;
	}

	private String a(){
		return toString()+ this.toString();
	}
}
