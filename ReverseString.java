package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Classroom Assignment 3: Reverse the String
		//String str = "hello"; // olleh
		//Goal: To understand the String, loop
		//a) Create a class by name: ReverseString (with main method) in same package
		//b) Write a logic to reverse a String
		//c) Run and Confirm the reversed String is printed in console
		//Hint: Convert the String to characters, get the characters in reverse order and 
		//print every character without white space.
		//Time to given: 10 - 15 minutes.
		
		String str = "MOHANARANGAM";
		System.out.println("Actual input string is "+str);
		char[] charArray1 = str.toCharArray();
		int len = charArray1.length;
		for (int i =len-1; i < 0; i--) {
		System.out.println(charArray1[i]);
			
			
		}

	}

}
