package week2.day1;

public class CharOccurence {

	public static void main(String[] args) {
		String text="welcome to chennai";
		int ecount=0;
		for (int i=0; i<text.length(); i++)
		{
			if (text.charAt(i)=='e')
				ecount++;
		}
		System.out.println("Total number of e's in the given sentence is " +ecount);
}
}