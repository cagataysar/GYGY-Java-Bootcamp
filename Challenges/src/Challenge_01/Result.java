package Challenge_01;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// Konsoldan girilen ünlü harflerin yerine 1,2,3..7,8 yazılacak
		// Örneğin Ahmet -> 1hm2t

		String kelime = new Scanner(System.in).nextLine();
		char karakter;

		for (int i = 0; i < kelime.length(); i++) {
			karakter = kelime.charAt(i);
			if (karakter == 'A' || karakter == 'a') {
				System.out.print("1");
			} else if (karakter == 'E' || karakter == 'e') {
				System.out.print("2");
			} else {
				System.out.print(karakter);
			}

		}

	}

}
