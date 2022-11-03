package week8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]colors= {"Red","White","Blue"};
		List<String>list1 = Arrays.asList(colors);
		
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("black");
		list2.add("Red");
		list2.add("green");
		for(String value:list2)
			System.out.println(value);
		System.out.println();
		list2.addAll(list1);
		for(String value:list2)
			System.out.println(value);
		
		System.out.println(Collections.frequency(list2, "Red"));
		Collections.sort(list2);
		for(String value:list2)
			System.out.println(value);
		
		System.out.println(Collections.binarySearch(list2, "green"));
		boolean disjoint = Collections.disjoint(list1, list2);
		
		System.out.printf("list1 and list2 %s elements in common%n",(disjoint ? "do not have":"have"));
	}

}
