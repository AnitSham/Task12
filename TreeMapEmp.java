package task12;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmp {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> emp=new TreeMap<>();
	 
		emp.put("Sham", 3245);
		emp.put("Zara", 1902);
		emp.put("Bavana", 4023);
		
		for(Map.Entry<String,Integer> E: emp.entrySet () ) {
			String key=E.getKey();
			int value=E.getValue();		
		System.out.println(key);	
		}

	}

}
