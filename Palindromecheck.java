package week2.day1;

public class Palindromecheck {

	public static void main(String[] args)
	{
	// Program to check if a given string is a Palindrome or not
		String str = "Radar", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i)
	    {
	      reverseStr = reverseStr + str.charAt(i);
	    }
    //Compare the string and reversed string
	    if (str.toLowerCase().equals(reverseStr.toLowerCase()))
	    {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else
	    {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }
	}