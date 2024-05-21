package interventions;

import java.util.ArrayList;

public class Function {
	private String name;
	private ArrayList<Variable> l_vars; 
	
	public Function(String n) {
		name = n;
		l_vars = new ArrayList<Variable>();
	} 

	public ArrayList<Variable> getVars() {
		return l_vars;
	}

	@Override
	public boolean equals(Object o) {
		return o.equals(name); 
	}

	@Override
	public String toString() {
		return name;
	}

}
