//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6	
		int [] elements = new int[6];
		
			elements[0] = 1;
			elements[1] = 5;
			elements[2] = 2;
			elements[3] = 8;
			elements[4] = 13;
			elements[5] = 6;
	
		
		// 2. Print out the first element in the array
			System.out.println(elements[0]);
	
		
		// 3. Print out the last element in the array without using the number 5
			System.out.println(elements[6-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
		//at Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:37)
		
		// 5. Print out the element in the array at position -1, what happens?
			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
			//at Week03ArraysAndMethodsLab.main(Week03ArraysAndMethodsLab.java:40)
			
		// 6. Write a traditional for loop that prints out each element in the array
			for (int e = 0; e < elements.length; e++) {
				System.out.println(elements[e]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array
			for (int element : elements) {
					System.out.println(element);
			}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			
			int sum = 0;
	        for (int i = 0; i < elements.length; i++) {
	            sum += elements[i];
	        }
	        
	        System.out.println("The sum of elements in the array is: " + sum);

	        	
		// 9. Create a new variable called average and assign the average value of the array to it
	        double average = sum / 6;
	        System.out.println(average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
	        	for (int element : elements) {
	        		if (element % 2 == 0);	
	        	else {
	        		System.out.println(element);
	        	}
	        }
	        		
	        		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
	    		String [] names = new String[4];
	    		
	    		names[0] = "Sam";
	    		names[1] = "Sally";
	    		names[2] = "Thomas";
	    		names[3] = "Robert";
	
		// 12. Calculate the sum of all the letters in the new array
	    		int count = 0;
	    		for (int i = 0; i < names.length; i++) {
	    			for (int j = 0; j < names[i].length(); j++) {
	    				if (Character.isLetter(names[i].charAt(j))) {
	    					count++;
	    		}
	    				
	    	}
	    }
	    		System.out.println("Letters: " +count);
	}
		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
	    			

		
		// 14. Write and test a method that takes a String name and  
					//returns a greeting.  Do not print in the method.

	
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
	 			//A. 13 has a return type of "void" which means it does not return anything.
	 			//B. 13 prints directly to the console, with no form of return. There is no other results beyond what is printed.
	 			// For 14 you have a return and can use the result repeatedly.
	 			//14 creates and returns the "greeting" as a string variable without having to print the string.
	 			
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		public static void methods(String[] args) {
	 			int number = 10;
	 			String words = "Hello";
	 			int wordCount = 0; 
	 			
	 			for (int i = 0; i < words.length(); i++) {
	    				if (Character.isLetter(words.charAt(i))) {
	    					wordCount++;
	    			}
	    		}
	 			
	 			if(wordCount > number) {
	 				System.out.println(true);
	 			} else {
	 				System.out.println(false);
	 			}	
		}
	 			
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		public class Main {
		    public static void main(String[] args) {
		        String[] words = {"cat", "dog", "ferret", "hamster"};
		        String targetWord = "cat";
		        
		        if (containsString(words, targetWord)) {
		            System.out.println("The array contains the word '" + targetWord + "'.");
		        } else {
		            System.out.println("The array does not contain the word '" + targetWord + "'.");
		        }
		    }

		    // 16
		    public static boolean containsString(String[] array, String target) {
		        for (String word : array) {
		            if (word.equals(target)) {
		                return true;
		            }
		        }
		        return false;
		    }
		}

		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	

	private static void printGreeting(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	// Method 13:
	public static void printGreeting1(String name) {
		System.out.println("Hello, " + name + "! Welcome to the program.");
}

	// Method 14:
		public static String getGreeting(String name) {
 			return "Hello, " + name + "! Welcome to the program.";
 		}
	
	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

}