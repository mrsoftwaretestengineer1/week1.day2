package week1.day2;

import java.util.StringTokenizer;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 * g) Displaying the String without duplicate words	
		 */
		String text = "Learn java basic from the java";
		String breaktext[];
		int count=0;
		breaktext=text.split(" ");
		String finaltext="";

		for(int i=0;i<breaktext.length;i++)
		{
			for(int j=i+1;j<breaktext.length;j++)
			{
				if(breaktext[i].equals(breaktext[j]))
				{
					count=count+1;	
				if(count!=0)
				{
					breaktext[j]="";
				}
				}
				}
			if(count!=0)
			{
				count=0;
			}
		}
		for (String word : breaktext) 
		{
			finaltext=finaltext+" "+word;
		}
		System.out.println(finaltext);
	}

}