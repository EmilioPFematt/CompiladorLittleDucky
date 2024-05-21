package interventions;

public class Cuadruplo {
	String operador;
	Variable izq;
	Variable der;
	int add; 

	public Cuadruplo(String o) {
		operador = o;
		izq = new Variable("");
		der = new Variable("");
		add = -1;
	}

	public Cuadruplo(String o, int a) {
		operador = o;
		izq = new Variable("");
		der = new Variable("");
		add = a;
	}
	
	public Cuadruplo(String o, Variable i, int a) {
		izq = i;
		der = new Variable("");
		operador = o;
		add = a;
	}

	public Cuadruplo(String o, Variable i, Variable d, int a){
		izq = i;
		der = d;
		operador = o;
		add = a;
	}

	public String validate() {
		String res = Middleman.cubo.get(new Key(izq.getType(), der.getType(), operador));
		return res; 
	}

	public int getAddress() {
		return add;
	}

	public void setAddress(int a) {
		add = a;
	}

	@Override
	public String toString() {
		return "\n" + operador + " " + izq.toString() + " " + der.toString() + " $" + add;
	}
}
