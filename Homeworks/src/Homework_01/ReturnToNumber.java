package Homework_01;
import java.util.Scanner;

public class ReturnToNumber {	
	
	/**
	 * Javadoc example. This comment seen on where method used. This method return a
	 * vowel letter to number.
	 */
	public void returnLetter() {
		System.out.print("İsminiz: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		char k;
		
		char[] vowels = {' ', 'A', 'E', 'I', 'İ', 'O'};
		char[] num = {'1', '2', '3', '4', '5', '6'};
		
		for (int i = 0; i < name.length(); i++) {
			k = name.charAt(i);
			for (int j = 1; j < name.length(); j++) {
				if(k == vowels[j]) {
					k = num[j];
					System.out.println(name);	
				} 
			}
		}
		System.out.println(name);
	}
	
}
		