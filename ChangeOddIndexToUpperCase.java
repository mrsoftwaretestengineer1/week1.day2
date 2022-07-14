
		package week1.day2;

		public class ChangeOddIndexToUpperCase {

			public static void main(String[] args) {
				
				/*
				 Pseudo Code
				 * Declare String Input as Follow
				 * String test = "changeme";
				 * a) Convert the String to character array
				 * b) Traverse through each character (using loop)
				 * c)find the odd index within the loop (use mod operator)
				 * d)within the loop, change the character to uppercase, if the index is odd else don't change
				 */
				
				String test1="default";
				char[] name=test1.toCharArray();
				int length=name.length;

				for(int i=0;i<length;i++)
				{
					if(i%2!=0) {
						//to convert a character to upper case
						name[i]=Character.toUpperCase(name[i]);
						
								}	
				}
				System.out.print(name);
			}

		}

	


