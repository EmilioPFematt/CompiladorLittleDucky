package interventions;

import java.util.HashMap;
import java.util.Objects;



public class Key {
  public final String a;
  public final String b;
  public final String c;

	public static HashMap<String, Integer> conv = new HashMap<String, Integer>() {{
		put("+", 0);
		put("-", 1);
		put("/", 2);
		put("*", 3);
		put("<", 4);
		put(">", 5);
		put("!=", 6);
		put("=", 7);
	}};

  public Key (String a, String b, String c) { 
    this.a = a;
    this.b = b;
    this.c = c;
		
  }
  @Override
	public boolean equals(Object o) {
		if(o instanceof Key){
			Key k = (Key)o;
			return k.hashCode() == hashCode();
		}
		return false; 
	}
	@Override
	public int hashCode() {
		int aRes = (a.equals("Integer"))?1:(a.equals("Float"))?2:(a.equals("String"))?3:4;
		int bRes = (b.equals("Integer"))?1:(b.equals("Float"))?2:(b.equals("String"))?3:4;
    return aRes * 100 + bRes*10 + conv.get(c);
	}
}


