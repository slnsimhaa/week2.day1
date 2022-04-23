package week2.day1;

public class ClassroomsessionB {

	public static void main(String[] args) {
		// Program to print the word that starts with 't' or 'T'
	String text="Testleaf is situated in twin towers teynampet";
	String[] words = text.split(" ");
	for(String wordTort : words) {
		if(wordTort.startsWith("T"))
		{
			System.out.println(wordTort);
		}
		else if (wordTort.startsWith("t"))
		{
			System.out.println(wordTort);
		}
}
}
}