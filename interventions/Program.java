package interventions;

import java.util.ArrayList;

//Esta clase va a contener todas las intervenciones

public class Program {
	private ArrayList<Variable> g_vars;
	private ArrayList<Function> g_funcs;
	private String name; 
	private boolean hasLocal = false; 
	private boolean f_error = false;
	private Middleman m;

	public Program(Middleman mi) {
		g_vars = new ArrayList<Variable>();
		g_funcs = new ArrayList<Function>();
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
		System.out.println("Cuadruplo: "+ q + " " + q.validate());
		if(q.validate() != "Error") {
			m.cuads.add(q);
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
		Middleman.opr.push(new Variable(v, type));
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
				System.out.println("assignError");
				return;
			}
			m.cuads.add(q);
		}
	}
	
	public void pushIf() {
		Variable exp = Middleman.opr.pop();
		if(!exp.getType().equals("Boolean")) return;
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
		Cuadruplo q = new Cuadruplo("Print", exp, exp.getAddress());
		m.cuads.add(q);
	}

	public void pushPrintString(String s) {
		Variable exp = new Variable(s, "String");
		Cuadruplo q = new Cuadruplo("Print", exp, -1);
		m.cuads.add(q);
	}

	public void pushNegative(String op) {
		if(op.equals("-")) {
			Middleman.opr.push(new Variable("-1", "Integer"));
			Middleman.ops.push("*");
		}
	}
}