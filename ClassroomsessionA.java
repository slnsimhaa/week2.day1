package week2.day1;

public class ClassroomsessionA {

	public static void main(String[] args) {
		//Program to count number of "e"'s in the word testleaf
		String text="testleaf";
		int ecount=0;
		for (int i=0; i<text.length(); i++)
		{
			if (text.charAt(i)=='e')
				ecount++;
		}
		System.out.println("Total number of e's in the given text is " +ecount);
}
}
