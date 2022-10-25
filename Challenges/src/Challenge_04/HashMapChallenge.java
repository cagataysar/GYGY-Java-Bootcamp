package Challenge_04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapChallenge {

	public static void main(String[] args) {
//		hashList("numankaraaslan");
		hashList2("numan karaaslan");
	}

	/**
	 * HashMap ile konsoldan girilen ifadeyi zipleyip harfleri listeye atmak Örnek:
	 * numankaraaslan -> numakrsl
	 * 
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
	 * karaaslan n3u1m1a5 1k1r1s1l1 (plus -> boşluğu yazdırma)
	 * 
	 */

	public static void hashList2(String str) {
		Map<String, Integer> hashMap = new LinkedHashMap();
		String lowerString = str.toLowerCase();
		int i = 1;

		for (String string : lowerString.split("")) {
			if (!hashMap.containsKey(string)) {
				hashMap.put(string, i);
			} else {
				hashMap.put(string, hashMap.get(string) + i);
			}
		}
		// keySet() metodu key'leri bir küme olarak verir
		for (String key : hashMap.keySet()) {
			System.out.print(key + "" + hashMap.get(key));
		}
	}

}
