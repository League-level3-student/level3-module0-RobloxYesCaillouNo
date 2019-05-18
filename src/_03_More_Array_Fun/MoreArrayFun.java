package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
	String words[] = new String[]{"James charles cancel'd, Minecraft, Sonic movie, Oof, idk"};
	
	allStringss(words);
	reverse(words);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void allStringss(String[] allStrings) {
		for (int i = 0; i < allStrings.length; i++) {
			System.out.println(allStrings[i]);
		}
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverse(String[] allStrings) {
	for (int i = allStrings.length-1; i >= 0; i--) {
		System.out.println(allStrings[i]);
	}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
}
