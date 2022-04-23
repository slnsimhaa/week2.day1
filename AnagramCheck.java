package week2.day1;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args)
	{
		// Check if the two given strings are Anagram
		String str1="Read";  
        String str2="Dear";  
  
        //Converting both the string to lower case.  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
  
        //Checking for the length of strings  
        if (str1.length() != str2.length())
        {  
            System.out.println("Both the strings are not anagram");  
        }  
        else
        {  
            //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(string1, string2) == true)
            {  
                System.out.println("Both the strings are anagram");  
            }  
            else
            {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    }  
}   