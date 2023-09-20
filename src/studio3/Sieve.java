package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		
	System.out.println("Which integer?");
	int num = in.nextInt();
	while(num<=1)
	{System.out.println("The integer needs to be greater than 1.");
	 num = in.nextInt();
	}
	boolean[] array1 = new boolean[num];
	for(int i = 0; i < array1.length; i++)
	{
			array1[i] = true;
	}
	for(int x = 2; x < array1.length; x++)
	{
	 for(int y = x; x*y < array1.length; y++)
	 {
		 int value = x*y;
		 array1[value] = false;
		 
	 }
	}
	
	for(int x = 2; x < array1.length; x++)
	{if(array1[x] == true)
	{System.out.println(x);}
	}
	
			
	}

}
