package task12;

import java.util.ArrayList;
import java.util.List;

public class ListtoArray {

	public static void main(String[] args) {
	
		List<String> Names= new ArrayList<>();
		Names.add("Apple");
		Names.add("Mango");
		Names.add("Grapes");
		Names.add("JackFruit");
		System.out.println("Number of elements in the list are: " +Names);
		
		String[] array=new String[Names.size()];
		Names.toArray(array);
		
		for(String things:array) {
			System.out.println(things);
		}	
	}

}
