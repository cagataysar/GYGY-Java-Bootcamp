package Challenge_04;

import java.util.ArrayList;

public class ArrayListChallenge {

	public static void main(String[] args) {

		String str = "Omer Atas ve Cagatay Sarıoglan";
		// karakter ve karakter sayısı listelerinin tanımlanması
		ArrayList<Integer> integers = new ArrayList<>();
		ArrayList<Character> characters = new ArrayList<>();

		// Karakterden kaç tane olduğunu tutan değişken
		int sayac = 0;
		// Sayısı bulunacak karakterin tutulduğu değişken
		char c;

		for (int i = 0; i < str.length() - 1; i++) {
			// Karakteri işlemler bittikten sonra ilgili listeye eklemek amacıyla değişkene
			// aldık
			c = str.charAt(i);
			for (int j = 0; j < str.length() - 1; j++) {
				// büyük ve küçük harf duyarlı olduğu için hepsini küçük harfe çevirdim
				if (String.valueOf(str.charAt(i)).toLowerCase().equals(String.valueOf(str.charAt(j)).toLowerCase())) {
					sayac++;
				}

			}
			// Karakter sayısı hesaplanacak karater previous da tutuldu.
			String previous = String.valueOf(c).toLowerCase();

			// bu kısımda tekrar olayı oluyordu. O kısmı bulunan karakter ve sayısı eğer
			// karakter listesinde yoksa eklenilmesini sağladım.
			// Diğer durumlarda eklemesine gerek yok
			if (!characters.contains(previous.charAt(0))) {
				characters.add(previous.charAt(0));
				integers.add(sayac);
			}
			sayac = 0;
		}

		// en çok tekrar eden karakterin sayısını bulma
		int max;
		max = integers.get(0);
		for (int i = 0; i < integers.size(); i++) {
			if (integers.get(i) > max) {
				max = integers.get(i);
			}
		}

		// En çok tekrar eden karakter
		System.out.println("En çok tekrar eden karakter : " + characters.get(integers.indexOf(max)));
	}

}
