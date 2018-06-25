import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class diceRoller {
	public static void main(String[] args)	{
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random(); 
		
		
		//int amountOfRolls = rand.nextInt(3) + 1; 
		//int numberOfSides = rand.nextInt(6) + 2; 
		int start = 1;
		int counter = 0; 
		int numbers = 0;
		int total = 0; 
		
		int save = 0; 
		
		System.out.println("Enter the amount of rolls (1-100): " );
		int store = input.nextInt(); 
		System.out.println("Enter the amount of sides (2-100):  ");
		int store2 = input.nextInt(); 
		int [] show = new int [store];
	//	System.out.println("Enter the amount of rolls: " + store);
	//	System.out.println("Enter the amount of sides: " + store2);
		
		
		
		//System.out.println(amountOfRolls + "d" + numberOfSides);
		//System.out.println("++++++++");
		
		while ( start < store2 )	{
			
			start++;
			
		}
		//numbers = rand.nextInt(start) + 1; 
		
		//System.out.println(numbers); 
		//System.out.println("--------");
		//System.out.println(start);
		
		//System.out.println(total);
		
		//System.out.println(start);
		//numbers = rand.nextInt(start) + 1; 
		
		//System.out.println("--------");
		//System.out.println(amountOfRolls);
		
		while ( store > counter )	{
			
			numbers = rand.nextInt(start) + 1;
			
			total += numbers;
			show[counter] += numbers;
			//System.out.println("Your roll: " + show[counter]);
			//System.out.println(total);
			//System.out.println("--------");
			counter++; 
					
		}
		System.out.println("====");
		for ( int x = 0; x < show.length; x++ )	{
			 
			// show[x] = numbers;
			 //System.out.println("Your roll: " + show[x]);
		 }
		System.out.println("Your rolls: " + Arrays.toString(show));
				
		
		
	/*	while ( amountOfRolls <= counter )	{
			
			numbers = rand.nextInt(start) + 1;
			System.out.println(numbers);
			total += numbers; 
			counter++; 
			
 */		
		System.out.println("=======");	
	System.out.println(total);
	
	 
	input.close(); 
	}
		
		
	
	
	public static int amountOfRolls()	{
		
		Random rand = new Random(); 
		
		int amountOfRolls = rand.nextInt(3) + 1; 
		
		
		return amountOfRolls;
		
	}
	
	public static int numberOfSides()	{
		
		Random rand = new Random(); 
		

		int start = 1; 
		int numberOfSides = rand.nextInt(4) + 2; 
		int counter = 0; 
		int numbers;
		int total = 0; 
		int amount = amountOfRolls(); 
		System.out.println(amount);
		
		while ( start < numberOfSides )	{
		
			start++; 
			
		}
		//System.out.println(start);
		
		while ( amount <= counter )	{
			
			numbers = rand.nextInt(start) + 1;
			System.out.println(numbers);
			total += numbers; 
			counter++; 
			
		}
		
		//System.out.println(amount);
		
		//int numbers = rand.nextInt(start) + 1; 
		//int numbers2 = rand.nextInt(start) + 1; 
		//System.out.println(numbers);
		
		//System.out.println(start);
	//	System.out.println(total); 
		return numberOfSides; 
	
	}
	
	
}
