package es.uniovi.reflection.bloch_3_10.compliant;

class B3 {
	
	private int a = 2;
	private int b = 2;
	private int c = 2;

    @Override
    public String toString() {
        return a + " " + b + " " + c;
    }

	public String ab() {
		B1 var = new B1();
		B2 var2 = new B2();
		return var.toString() + var2.toString() + toString() + this.toString();
	}
}
