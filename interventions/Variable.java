package interventions;

public class Variable {
	private String name;
	private String type;
	private int add;

	public Variable(String n, String t, int v) {
		name = n;
		if(t.equals("int")) type = "Integer";
		if(t.equals("float")) type = "Float";
		else type = t;
		add = v; 
	}

	public Variable(String n, String t) {
		name = n;
		if(t.equals("int")) type = "Integer";
		if(t.equals("float")) type = "Float";
		else type = t;
	}
	
	public Variable(String n) {
		name = n;
	}
	
	public Variable() {
		name = "";
		type = "";
	}

	public int getAddress() {
		return add;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public void setAdd(int a) {
		add = a;
	}

	@Override
	public boolean equals(Object o) {
		return o.equals(this.getName()); 
	}

	@Override
	public String toString() {
		return this.getName();
	}
};