package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	String words[] = new String[]{"James charles cancel'd ", "Minecraft ", "Sonic movie ", "Oof ", "idk "};
	
	allStringss(words);
	System.out.println(" ");
	reverse(words);
	System.out.println(" ");
	everyOtherString(words);
	System.out.println(" ");
	randomized(words);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void allStringss(String[] allStrings) {
		for (int i = 0; i < allStrings.length; i++) {
			System.out.print(allStrings[i]);
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverse(String[] allStrings) {
	for (int i = allStrings.length-1; i >= 0; i--) {
		System.out.print(allStrings[i]);
	}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOtherString(String[] allStrings) {
		for (int i = 0; i < allStrings.length; i+=2) {
			System.out.print(allStrings[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomized(String[] allStrings) {
		Random rand = new Random();
		boolean isRand = true;
		boolean[] boolarray = new boolean[allStrings.length];
		for (int i = 0; i < boolarray.length; i++) {
			boolarray[i] = true;
		}
		int count = 0;
		while (isRand) {
			int randdd = rand.nextInt(boolarray.length);
			if (boolarray[randdd]) {
				boolarray[randdd] = false;
				count++;
				System.out.print(allStrings[randdd]);
			}
			if (count == boolarray.length) {
				isRand = false;
			}
		
		}
	}
	
}
