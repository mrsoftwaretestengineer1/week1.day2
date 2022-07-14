package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not

				/*
				 * Pseudo Code
				 * a) Declare A String value as"madam"
				 * b) Declare another String rev value as ""
				 * c) Iterate over the String in reverse order
				 * d) Add the char into rev
				 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
				 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
				 */
		String value1="Dad";
		int length1=value1.length();
		String value2="";
		
		for(int i=(length1-1);i>=0;i--)

		{
			value2=value2+value1.charAt(i);
		}
		

	 System.out.println("String1 "+value1+ "\nString2 "+value2);
		if(value1.equalsIgnoreCase(value2))
		{
			System.out.println("It is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}
}
