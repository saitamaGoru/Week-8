package week8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Wrapper {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Character[] letters = {'B','C','M','G','L'};
		List<Character> letters2 = Arrays.asList(letters);
		
		Output(letters2);
		System.out.println();
		Collections.reverse(letters2);
		Collections.shuffle(letters2);
		Output(letters2);
		System.out.println();
		Collections.fill(letters2, 'R');
		
		Output(letters2);
		Collections.frequency(letters2, 'b');
		Output(letters2);
		
		
	}
	
	static void Output(List<Character> list)
	{
		for(Character value : list)
		{
			System.out.printf("%s",value);
			System.out.println();
		}
			
		System.out.println("Max value:"+Collections.min(list));
		System.out.println("Min value:"+Collections.max(list));
	}

}
