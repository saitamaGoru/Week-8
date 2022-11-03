package week8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

	public static void main(String[] args) 
	{
		
		String[] colors = {"black","yellow","green","blue","silver"};
		
		List<String> list = new LinkedList <>();
		
		for(String value : colors)
			list.add(value);
		
		String[] colorsTwo = {"gold","white","brown","blue","grey","silver"};
		
		List<String> listTwo = new LinkedList <>();
		
		for(String value : colorsTwo)
			listTwo.add(value);
		
		list.addAll(listTwo);
		listTwo = null;
		Print(list);
		
		
		
	}
	
	private static void Print(List<String> list)
	{
		
		for(String value :list)
			System.out.println(value);
	}
	
	private static void ConvertList(List<String>list)
	{
		ListIterator<String> iterator = list.listIterator();
		for(String value :list)
			System.out.println(value.toUpperCase());
	}
	
	

}
