package Challenge_02;

import java.util.Arrays;

public class LetterFrequence {

	public void zip(String text) {
		
		int[] frequence = new int[text.length()];
		System.out.println("Text length: " + text.length());
		int i, j;

		char[] textArray = text.toCharArray();
		System.out.println("textArray " + Arrays.toString(textArray));
		
		for (i = 0; i < text.length(); i++) {
			frequence[i] = 1;
			for (j = i+1; j < text.length(); j++) {
				if (textArray[i] == textArray[j]) {
					frequence[i]++;
					textArray[j] = '0';
				}
			}
		}
		System.out.print("Tekrar eden sayılar: ");
		for (i = 0; i < frequence.length; i++) {
			if ((textArray[i] != ' ') && textArray[i] != '0') {
				System.out.print(textArray[i] + "" + frequence[i]);
			}
		}
	}
}
