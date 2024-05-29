package interventions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//Esta clase va a contener todas las intervenciones

public class Program {
	private ArrayList<Variable> g_vars;
	private ArrayList<Function> g_funcs;
	private ArrayList<Variable> dir_const; 
	private String name; 
	private boolean hasLocal = false; 
	private boolean f_error = false;
	private Middleman m;

	public Program(Middleman mi) {
		g_vars = new ArrayList<Variable>();
		g_funcs = new ArrayList<Function>();
		dir_const = new ArrayList<Variable>();
		dir_const.add(new Variable("-1", "Integer", 0));
		m = mi;
	}
	public void setName(String n) {
		name = n;
	}

	public void setLocal(boolean b) {
		hasLocal = b; 
	}

	public ArrayList<Function> getFuncs() {
		return g_funcs;
	}

	public void addFunc(String name, int linea) {
		Function f = new Function(name);
		if(g_funcs.contains(f) || g_vars.contains(new Variable(name))){
			f_error = true; 
			System.out.println("P ERROR EN LINEA " + linea + ": FUNCTION " + name + " YA FUE DECLARADA.");
		}
		g_funcs.add(f);
	}

	public void decVars(ArrayList<String> l_vars, String type, int linea) {
		for(String i : l_vars) {
			Variable v = new Variable(i, type);
			if(i == name) {
				if(hasLocal) f_error = true;
				System.out.println("P ERROR EN LINEA " + linea + ": UNA VARIABLE NO PUEDE TENER EL MISMO NOMBRE DEL PROGRAMA.");
			}
			else if(g_vars.contains(v)){
				if(hasLocal) f_error = true;
				System.out.println("P ERROR EN LINEA " + linea + ": VARIABLE " + i + " YA DECLARADA.");
			}
			else if(hasLocal && g_funcs.get(g_funcs.size()-1).getVars().contains(v)) {
				f_error=true;
				System.out.println("P ERROR EN LINEA " + linea + ": VARIABLE " + i + " YA DECLARADA.");
			}
			else {
				if(hasLocal){
					v.setAdd(m.nextMemory());
					g_funcs.get(g_funcs.size()-1).getVars().add(v);
				}
				else {
					v.setAdd(m.nextMemory());
					g_vars.add(v);
				}
			}
		}
		l_vars.clear();
	}

	public void decVar(String n, String type, int linea) {
		Variable v = new Variable(n, type);
		if(n == name) {
			if(hasLocal) f_error = true;
			System.out.println("P ERROR EN LINEA " + linea + ": UNA VARIABLE NO PUEDE TENER EL MISMO NOMBRE DEL PROGRAMA.");
		}
		else if(g_vars.contains(v)){
			if(hasLocal) f_error = true;
			System.out.println("P ERROR EN LINEA " + linea + ": VARIABLE " + n + " YA DECLARADA.");
		}
		else if(hasLocal && (g_funcs.get(g_funcs.size()-1).getVars().contains(v) || g_funcs.contains(new Function(n)))) {
			f_error = true;
			System.out.println("P ERROR EN LINEA " + linea + ": VARIABLE " + n + " YA DECLARADA.");
		}
		else {
			if(hasLocal){
				v.setAdd(m.nextMemory());
				g_funcs.get(g_funcs.size()-1).getVars().add(v);
			}
			else {
				v.setAdd(m.nextMemory());
				g_vars.add(v);
			}
		}
	}


	public void checkVarExists(String n, int linea) {
		Variable v = new Variable(n);
		boolean ans = g_vars.contains(v) || (hasLocal && g_funcs.get(g_funcs.size()-1).getVars().contains(v));
		if(!ans) {
			if(hasLocal) f_error = true;
			System.out.println("P ERROR EN LINEA " + linea + ": VARIABLE " + v.getName() + " NO DEFINIDA");
		}
	}

	public void checkFuncExists(String f_name, int linea) {
		if(g_funcs.contains(new Function(f_name))){
			System.out.println("P ERROR EN LINEA " + linea + ": FUNCTION " + f_name + " NO DEFINIDA");
		}
	}

	public void deleteFunc(String name) {
		if(f_error) {
			m.setMemory(g_funcs.get(g_funcs.size()-1).getVars().get(0).getAddress()-1);
			g_funcs.remove(g_funcs.size()-1);
		}
		f_error = false;
	}

	public void createCuad(Variable l, Variable r, String op) {
		Cuadruplo q = new Cuadruplo(op, l, r, m.nextMemory());
		if(q.validate() != "Error") {
			m.cuads.add(q);
		}
		else {
			System.out.println("ERROR DE TIPOS\n");
		}
	}

	public void pushQVar(String id) {
		if(g_vars.contains(new Variable(id))){
			int in = g_vars.indexOf(new Variable(id));
			Variable v = g_vars.get(in);
			Middleman.opr.push(v);
		}
		else if(hasLocal && g_funcs.get(g_funcs.size() - 1).getVars().contains(new Variable(id))) {
			int in = g_funcs.get(g_funcs.size() - 1).getVars().indexOf(new Variable(id));
			Variable v = g_funcs.get(g_funcs.size() - 1).getVars().get(in);
			Middleman.opr.push(v);
		}
	}

	public void pushQConst(String v, String type) {
		Variable V = new Variable(v, type);
		boolean cont = false;
		if(dir_const.contains(V)){
			V = dir_const.get(dir_const.indexOf(V));
			cont = true;
		}
		else V.setAdd(m.nextMemory());
		Middleman.opr.push(V);
		if(!cont) dir_const.add(V);
	}

	public void pushOps(String op) {
		Middleman.ops.push(op);
	}

	public void pushAdd() {
		if(Middleman.ops.empty()) return;
		while(!Middleman.ops.empty() && (Middleman.ops.peek().equals("+") || Middleman.ops.peek().equals("-"))) {
			Variable r_op = Middleman.opr.pop();
			Variable l_op = Middleman.opr.pop(); 
			String ops = Middleman.ops.pop();
			Cuadruplo q = new Cuadruplo(ops, l_op, r_op, m.nextMemory());
			String res_Type = q.validate();
			if(res_Type.equals("Error")) {
				System.out.println("Type mismatch");
				m.setMemory(q.getAddress() - 1);
				return;
			}
			m.cuads.add(q);
			Middleman.opr.push(new Variable("$"+q.getAddress(), res_Type, q.getAddress()));
		}
	}

	public void pushMult() {
		if(Middleman.ops.empty()) return;
		while(!Middleman.ops.empty() && (Middleman.ops.peek().equals("*") || Middleman.ops.peek().equals("/"))) {
			Variable r_op = Middleman.opr.pop(); 
			Variable l_op = Middleman.opr.pop();
			String op = Middleman.ops.pop();
			Cuadruplo q = new Cuadruplo(op, l_op, r_op, m.nextMemory());
			String res_Type = q.validate();
			if(res_Type.equals("Error")) {
				System.out.println("Type Mismatch");
				m.setMemory(q.getAddress() - 1);
				return;
			}
			m.cuads.add(q);
			Middleman.opr.push(new Variable("$"+q.getAddress(), res_Type, q.getAddress()));
		}
	}

	public void pushRelational() {
		if(Middleman.ops.empty()) return;
		if(!Middleman.ops.empty() && (Middleman.ops.peek().equals(">") || Middleman.ops.peek().equals("<") || Middleman.ops.peek().equals("!="))) {
			Variable r_op = Middleman.opr.pop();
			Variable l_op = Middleman.opr.pop(); 
			String ops = Middleman.ops.pop();
			Cuadruplo q = new Cuadruplo(ops, l_op, r_op, m.nextMemory());
			String res_Type = q.validate();
			if(res_Type.equals("Error")) {
				System.out.println("Type mismatch");
				m.setMemory(q.getAddress() - 1);
				return;
			}
			m.cuads.add(q);
			Middleman.opr.push(new Variable("$"+q.getAddress(), res_Type, q.getAddress()));
		}
	}

	public void createFBottom() {
		Middleman.opr.push(new Variable("(", "FalseBottom"));
		Middleman.ops.push("(");
	}

	public void removeFBottom() {
		Variable res = Middleman.opr.pop();
		Middleman.opr.pop();
		Middleman.opr.push(res);
		Middleman.ops.pop();
	}

	public void pushAssign(String id) {
		Middleman.ops.push("=");
		pushQVar(id);
	}
	public void popAssign() {
		if(Middleman.ops.peek().equals("=")) {
			Variable r_op = Middleman.opr.pop();
			Variable l_op = Middleman.opr.pop(); 
			String ops = Middleman.ops.pop();
			Cuadruplo q = new Cuadruplo(ops, l_op, r_op, l_op.getAddress());
			String res = q.validate();
			if(res == "Error") {
				System.out.println("Assign Error: Type Mismatch");
				return;
			}
			m.cuads.add(q);
		}
	}
	
	public void pushIf() {
		Variable exp = Middleman.opr.pop();
		if(!exp.getType().equals("Boolean")) {
			System.out.println("If error: Result of expression is not of type boolean");
			return;
		}
		Cuadruplo q = new Cuadruplo("GotoF", exp, 0);
		m.cuads.add(q);
		Middleman.saltos.push(m.cuads.size()-1);
	}

	public void pushElse() {
		Cuadruplo q = new Cuadruplo("Goto");
		m.cuads.add(q);
		int f = Middleman.saltos.pop();
		Middleman.saltos.push(m.cuads.size()-1);
		m.cuads.get(f).setAddress(m.cuads.size());
	}

	public void endIf() {
		int end = Middleman.saltos.pop();
		m.cuads.get(end).setAddress(m.cuads.size());
	}

	public void pushDo() {
		Middleman.saltos.push(m.cuads.size());
	}

	public void popDo() {
		Variable exp = Middleman.opr.pop();
		if(!exp.getType().equals("Boolean")) return;
		int a = Middleman.saltos.pop();
		Cuadruplo q = new Cuadruplo("GotoV", exp, a);
		m.cuads.add(q);
	}
	public void pushPrintExpresion() {
		Variable exp = Middleman.opr.pop();
		Cuadruplo q = new Cuadruplo("Print", exp, -1);
		m.cuads.add(q);
	}

	public void pushPrintString(String s) {
		Variable exp = new Variable(s, "String");
		boolean cont = false;
		if(dir_const.contains(exp)) {
			exp.setAdd(dir_const.get(dir_const.indexOf(exp)).getAddress());
			cont = true;
		}
		else exp.setAdd(m.nextMemory());
		Cuadruplo q = new Cuadruplo("Print", exp, -1);
		m.cuads.add(q);
		if(!cont)
			dir_const.add(exp);
	}

	public void pushNegative(String op) {
		if(op.equals("-")) {
			Middleman.opr.push(new Variable("-1", "Integer", 0));
			Middleman.ops.push("*");
		}
	}

	public void writeToFile() {
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter("./MaquinaVirtual/Programa.txt"));
			
			w.write("CONSTANTES\n");
			for(Variable i:dir_const) {
				w.write(i.getName() + ' ' + i.getType() + ' ' + i.getAddress() + "\n");
			}
			w.write("VARIABLES\n");
			for(Variable i:g_vars) {
				w.write(i.writeVar() + "\n");
			}
			w.write("CUADRUPLOS\n");
			for(Cuadruplo i:m.cuads) {
				w.write(i.toString() + "\n");
			}
			
			w.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}