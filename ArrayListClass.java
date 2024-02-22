package task12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		
		List<String> listt=new ArrayList<String>();
		
		//Add elements
		listt.add("Fruits");
		listt.add("Vegetables");
		listt.add("Chocolates");
		listt.add("Icecreams");
		listt.add("Junk Foods");
		System.out.println("Added elements to the listt: " +listt);

		//Remove All elements
		listt.removeAll(listt);
		System.out.println("Removed all the elements to the listt: " +listt);
	}

}
