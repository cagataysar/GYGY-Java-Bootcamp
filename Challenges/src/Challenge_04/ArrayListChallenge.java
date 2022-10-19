package Challenge_04;

import java.util.ArrayList;

public class ArrayListChallenge {

	public static void main(String[] args) {

		// zipWarraylist("Numan karaaslan");
		arrayList("cagataysarioglan");
	}

	/**
	 * ArrayList ile konsoldan girilen ifadeyi zipleyip harfleri listeye atmak
	 * Örnek: numankaraaslan -> numakrsl
	 * 
	 * @param str
	 */
	public static void arrayList(String str) {
		ArrayList<Character> newArrayList = new ArrayList<>();
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if (!newArrayList.contains(str.charAt(i))) {
				newArrayList.add(str.charAt(i));
			}
		}
		for (Character newChar : newArrayList) {
			newString += newChar;
		}
		System.out.println("New String is : " + newString);
	}

	/**
	 * ArrayList ile konsoldan girilen string içerisinde hangi harften kaç tane
	 * bulunduğunu sıralı bir şekilde yazmak Örnek: numan -> n2u1m1a1 Numan
	 * karaaslan n3u1m1a5 1k1r1s1l1
	 * 
	 * @param str
	 */
//	private static void zipWarraylist(String str) {
//		ArrayList<Character> CharList = new ArrayList<>();
//		String zippedText = "";
//		for (int i = 0; i < str.length(); i++) {
//			if (!CharList.contains(str.charAt(i))) {
//				CharList.add(str.charAt(i));
//			}
//		}
//		for (Character character : CharList) {
//			zippedText += character;
//			zippedText += countOfChar(str, character);
//		}
//		System.out.println("-> Zip With ArrayList :");
//		System.out.println(zippedText);
//	}

//	private static int countOfChar(String str, char character) {
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == character) {
//				count++;
//			}
//		}
//		return count;
//	}
}
