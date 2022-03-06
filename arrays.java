package cours;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	private static Object Scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//////////////////////////////// ARRAYS//////////////////////////////////////////////
		
		// DECLARING AN ARRAY
		int[] myArray = new int[200];
		
		// DECLARING AN ARRAY 
		int[] myArrayOfThree = new int[3]; 
		
		// DECLARING AN ARRAY 
		int[] myArrayoften = new int[10]; 
		
		// INITIALIZING AN ARRAY
		myArrayOfThree[0] = 15;
		// INITIALIZING AN ARRAY	
		myArray[0] = 10;
		//Declaring a String variable array
		String[] namesArray= new String[5];
		
		
		// PRINTING THE TWO ARRAYS
		System.out.println("myArray in index 0 is " + myArray[0]);
		System.out.println("my array in index 0 is " + myArrayOfThree[0]);
		
		// Initialising array with integer
		// Initializing an array of 10
		System.out.println("===================================");
		System.out.println("initializing an array of 10 elemnts with for loop");
		for (int i=0; i< myArrayoften.length; i++) {
			System.out.println(i);
		}
		//user inputs into an array with Scanner
		Scanner userInput = new Scanner(System.in);
		//Eteration over the array with for loop to store names with "incrementation"
		// asking for input
		System.out.println("Mettez un nom");
		// FOR LOOP WITH DO WHILE CONDITION TO STOP FOR LOOP WHEN THE LIMIT OF THE ARRAY IS REACHED
		do {
			for (int i = 0; i < namesArray.length; i++) {
			namesArray[i] = userInput.nextLine();
			}
		} while (namesArray[namesArray.length-1] == ""); // Condition to stop inputing more data in the Array
			
		System.out.println(Arrays.toString(namesArray)); // print the entire array 
		
		
		
		
		
	} // END OF MAIN

}
