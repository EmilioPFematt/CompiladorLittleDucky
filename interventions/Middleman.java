package interventions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Middleman {
	public ArrayList<Cuadruplo> cuads = new ArrayList<Cuadruplo>();;
	private int nextMem = 0; 
	public static Stack<String> ops = new Stack<String>();
	public static Stack<Integer> saltos = new Stack<Integer>(); 
	public static Stack<Variable> opr = new Stack<Variable>();

	public static HashMap<Key, String> cubo = new HashMap<Key, String>(){{
		//Empezar con Integer
		put(new Key("Integer", "Integer", "+"), "Integer");
		put(new Key("Integer", "Integer", "-"), "Integer");
		put(new Key("Integer", "Integer", "/"), "Integer");
		put(new Key("Integer", "Integer", "*"), "Integer");
		put(new Key("Integer", "Integer", ">"), "Boolean");
		put(new Key("Integer", "Integer", "<"), "Boolean");
		put(new Key("Integer", "Integer", "!="), "Boolean");
		put(new Key("Integer", "Integer", "="), "Integer");

		put(new Key("Integer", "Float", "+"), "Float");
		put(new Key("Integer", "Float", "-"), "Float");
		put(new Key("Integer", "Float", "/"), "Float");
		put(new Key("Integer", "Float", "*"), "Float");
		put(new Key("Integer", "Float", ">"), "Boolean");
		put(new Key("Integer", "Float", "<"), "Boolean");
		put(new Key("Integer", "Float", "!="), "Boolean");
		put(new Key("Integer", "Float", "="), "Error");

		put(new Key("Integer", "String", "+"), "Error");
		put(new Key("Integer", "String", "-"), "Error");
		put(new Key("Integer", "String", "/"), "Error");
		put(new Key("Integer", "String", "*"), "Error");
		put(new Key("Integer", "String", ">"), "Error");
		put(new Key("Integer", "String", "<"), "Error");
		put(new Key("Integer", "String", "!="), "Error");
		put(new Key("Integer", "String", "="), "Error");

		put(new Key("Integer", "Boolean", "+"), "Error");
		put(new Key("Integer", "Boolean", "-"), "Error");
		put(new Key("Integer", "Boolean", "/"), "Error");
		put(new Key("Integer", "Boolean", "*"), "Error");
		put(new Key("Integer", "Boolean", ">"), "Error");
		put(new Key("Integer", "Boolean", "<"), "Error");
		put(new Key("Integer", "Boolean", "!="), "Error");
		put(new Key("Integer", "Boolean", "="), "Error");

		//Empezar con float
		put(new Key("Float", "Integer", "+"), "Float");
		put(new Key("Float", "Integer", "-"), "Float");
		put(new Key("Float", "Integer", "/"), "Float");
		put(new Key("Float", "Integer", "*"), "Float");
		put(new Key("Float", "Integer", ">"), "Boolean");
		put(new Key("Float", "Integer", "<"), "Boolean");
		put(new Key("Float", "Integer", "!="), "Boolean");
		put(new Key("Float", "Integer", "="), "Float");

		put(new Key("Float", "Float", "+"), "Float");
		put(new Key("Float", "Float", "-"), "Float");
		put(new Key("Float", "Float", "/"), "Float");
		put(new Key("Float", "Float", "*"), "Float");
		put(new Key("Float", "Float", ">"), "Boolean");
		put(new Key("Float", "Float", "<"), "Boolean");
		put(new Key("Float", "Float", "!="), "Boolean");
		put(new Key("Float", "Float", "="), "Float");

		put(new Key("Float", "String", "+"), "Error");
		put(new Key("Float", "String", "-"), "Error");
		put(new Key("Float", "String", "/"), "Error");
		put(new Key("Float", "String", "*"), "Error");
		put(new Key("Float", "String", ">"), "Error");
		put(new Key("Float", "String", "<"), "Error");
		put(new Key("Float", "String", "!="), "Error");
		put(new Key("Float", "String", "="), "Error");

		put(new Key("Float", "Boolean", "+"), "Error");
		put(new Key("Float", "Boolean", "-"), "Error");
		put(new Key("Float", "Boolean", "/"), "Error");
		put(new Key("Float", "Boolean", "*"), "Error");
		put(new Key("Float", "Boolean", ">"), "Error");
		put(new Key("Float", "Boolean", "<"), "Error");
		put(new Key("Float", "Boolean", "!="), "Error");
		put(new Key("Float", "Boolean", "="), "Error");

		//Empezar con String
		put(new Key("String", "Integer", "+"), "Error");
		put(new Key("String", "Integer", "-"), "Error");
		put(new Key("String", "Integer", "/"), "Error");
		put(new Key("String", "Integer", "*"), "Error");
		put(new Key("String", "Integer", ">"), "Error");
		put(new Key("String", "Integer", "<"), "Error");
		put(new Key("String", "Integer", "!="), "Error");
		put(new Key("String", "Integer", "="), "Error");

		put(new Key("String", "Float", "+"), "Error");
		put(new Key("String", "Float", "-"), "Error");
		put(new Key("String", "Float", "/"), "Error");
		put(new Key("String", "Float", "*"), "Error");
		put(new Key("String", "Float", ">"), "Error");
		put(new Key("String", "Float", "<"), "Error");
		put(new Key("String", "Float", "!="), "Error");
		put(new Key("String", "Float", "="), "Error");

		put(new Key("String", "String", "+"), "Error");
		put(new Key("String", "String", "-"), "Error");
		put(new Key("String", "String", "/"), "Error");
		put(new Key("String", "String", "*"), "Error");
		put(new Key("String", "String", ">"), "Error");
		put(new Key("String", "String", "<"), "Error");
		put(new Key("String", "String", "!="), "Boolean");
		put(new Key("String", "String", "="), "Error");

		put(new Key("String", "Boolean", "+"), "Error");
		put(new Key("String", "Boolean", "-"), "Error");
		put(new Key("String", "Boolean", "/"), "Error");
		put(new Key("String", "Boolean", "*"), "Error");
		put(new Key("String", "Boolean", ">"), "Error");
		put(new Key("String", "Boolean", "<"), "Error");
		put(new Key("String", "Boolean", "!="), "Error");
		put(new Key("String", "Boolean", "="), "Error");

		//Empezar con Booleano
		put(new Key("Boolean", "Integer", "+"), "Error");
		put(new Key("Boolean", "Integer", "-"), "Error");
		put(new Key("Boolean", "Integer", "/"), "Error");
		put(new Key("Boolean", "Integer", "*"), "Error");
		put(new Key("Boolean", "Integer", ">"), "Error");
		put(new Key("Boolean", "Integer", "<"), "Error");
		put(new Key("Boolean", "Integer", "!="), "Error");
		put(new Key("Boolean", "Integer", "="), "Error");

		put(new Key("Boolean", "Float", "+"), "Error");
		put(new Key("Boolean", "Float", "-"), "Error");
		put(new Key("Boolean", "Float", "/"), "Error");
		put(new Key("Boolean", "Float", "*"), "Error");
		put(new Key("Boolean", "Float", ">"), "Error");
		put(new Key("Boolean", "Float", "<"), "Error");
		put(new Key("Boolean", "Float", "!="), "Error");
		put(new Key("Boolean", "Float", "="), "Error");

		put(new Key("Boolean", "String", "+"), "Error");
		put(new Key("Boolean", "String", "-"), "Error");
		put(new Key("Boolean", "String", "/"), "Error");
		put(new Key("Boolean", "String", "*"), "Error");
		put(new Key("Boolean", "String", ">"), "Error");
		put(new Key("Boolean", "String", "<"), "Error");
		put(new Key("Boolean", "String", "!="), "Error");
		put(new Key("Boolean", "String", "="), "Error");

		put(new Key("Boolean", "Boolean", "+"), "Error");
		put(new Key("Boolean", "Boolean", "-"), "Error");
		put(new Key("Boolean", "Boolean", "/"), "Error");
		put(new Key("Boolean", "Boolean", "*"), "Error");
		put(new Key("Boolean", "Boolean", ">"), "Error");
		put(new Key("Boolean", "Boolean", "<"), "Error");
		put(new Key("Boolean", "Boolean", "!="), "Boolean");
		put(new Key("Boolean", "Boolean", "="), "Boolean");
	}};
	
	public Middleman() {
	}

	public int nextMemory() {
		nextMem+=1; 
		return nextMem;
	}

	public void setMemory(int m) {
		nextMem = m;
	}

	public int getMem() {
		return nextMem;
	}
	
	public int getAddress() {
		return nextMem;
	}
}
