package week8;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FinalListTest {

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
		
		ConvertList(list);
		Set(list);
	}
	
	private static void Print(List<String> list)
	{
		
		for(String value :list)
			System.out.println(value);
	}
	
	private static void ConvertList(List<String>list)
	{
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
				System.out.println("Value:" + iterator.next().toUpperCase());
		}
	}
	
	private static void Set(List<String>list)
	{
		ListIterator<String> iterator = list.listIterator();
		
			
			
			while (iterator.hasNext()) {
				
				System.out.println("Value:" + iterator.next().toUpperCase());
				
				
		}
			iterator.set("Pink");
			for(String item : list)
				System.out.println(item);
	}
	

}
