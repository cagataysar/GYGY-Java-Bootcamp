package Challenge_04;

import java.util.HashMap;

public class HashMapChallenge {

	public static void main(String[] args) {
		hashList("numankaraaslan");
//		hashList2("cagatay");
	}

	/**
	 * HashMap ile konsoldan girilen ifadeyi zipleyip harfleri listeye atmak Örnek:
	 * numankaraaslan -> numakrsl
	 * 
	 * @param str
	 */

	public static void hashList(String str) {
		HashMap<Integer, Character> hashMap = new HashMap<>();
		String newString = "";
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!hashMap.containsValue(str.charAt(i))) {
				hashMap.put(k, str.charAt(i));
				k++;
			}
		}
		for (Character newChar : hashMap.values()) {
			newString += newChar;
		}

		System.out.println("New String is : " + newString);
	}

	/**
	 * HashMap ile konsoldan girilen string içerisinde hangi harften kaç tane
	 * bulunduğunu sıralı bir şekilde yazmak Örnek: numan -> n2u1m1a1 Numan
	 * karaaslan n3u1m1a5 1k1r1s1l1
	 * 
	 * @param str
	 */

	public static void hashList2(String str) {
		HashMap<Integer, Character> hashMap = new HashMap<>();
		String newString = "";
		int k = 0;
		int count = 0;
		int i;
		for (i = 0; i < str.length(); i++) {
			if (!hashMap.containsValue(str.charAt(i))) {
				hashMap.put(k, str.charAt(i));
				k++;
			}
		}

		for (i = 0; i < str.length(); i++) {
			if (hashMap.containsValue(str.charAt(i))) {
				count++;
			}
		}

		System.out.println("New String is : " + newString.charAt(i) + "" + count);
	}

}
