package interventions;

import java.util.ArrayList;

public class Interventions {
	public static boolean checkVariable(ArrayList<Variable> vars, Variable var, int linea) {
		boolean cont = vars.contains(var);
		if (cont) {
			System.out.println("ERROR EN LINEA " + linea + " VARIABLE " + var.getName() + " YA FUE DEFINIDA.");
		} else {
			vars.add(var);
		}
		return cont;
	}

	public static boolean checkVariable(ArrayList<Variable> vars, ArrayList<Variable> l_vars, Variable var, int linea) {
		boolean cont = (vars.contains(var) || l_vars.contains(var));
		if (cont) {
			System.out.println("ERROR EN LINEA " + linea + " VARIABLE " + var.getName() + " YA FUE DEFINIDA.");
		} else {
			vars.add(var);
		}
		return cont;
	}

	public static Variable createVariable(String name, String type) {
		if (type == "float") {
			return new Variable(name, type);
		}
		return new Variable(name, type);
	}

	public static void checkDefinition(ArrayList<Variable> vars, String var, int line) {
		boolean cont = vars.contains(new Variable(var));
		if(!cont){
			System.out.println("ERROR EN LINEA " + line + " VARIABLE " + var + " NO DEFINIDA.");
		}
	}
	public static void checkDefinition(ArrayList<Variable> vars, ArrayList<Variable> l_vars, String var, int line) {
		Variable v = new Variable(var);
		boolean cont = (vars.contains(v) || l_vars.contains(v));
		if(!cont){
			System.out.println("ERROR EN LINEA " + line + " VARIABLE " + var + " NO DEFINIDA.");
		}
	}
}