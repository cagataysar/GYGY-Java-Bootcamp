import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
//		ornek1();
//		ornek2();
		ornek3();
	}

	private static void ornek3() {
		ArrayList<String> kisiler = new ArrayList<>();
		kisiler.add("Veli");
		kisiler.add("Mahmut");
		kisiler.add("Ali");
		kisiler.add("Deniz");

		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String kisi) {
				return kisi.contains("e");
			}
		};

		kisiler = (ArrayList<String>) kisiler.stream().filter(kisi -> kisi.contains("e")).collect(Collectors.toList());
//		kisiler = (ArrayList<String>) kisiler.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(kisiler);

	}

	private static void ornek2() {
		ArrayList<String> kisiler = new ArrayList<>();
		kisiler.add("Veli");
		kisiler.add("Mahmut");
		kisiler.add("Ali");
		kisiler.add("Deniz");

//		Consumer<String> consumer = new Consumer<String>() {
//			@Override
//			public void accept(String kisi) {
//				System.out.println(kisi);
//			}
//		};
//		kisiler.forEach(consumer);

//		kisiler.forEach(kisi -> System.out.println(kisi));

		ArrayList<Integer> sayilar = new ArrayList<>();
		sayilar.add(33);
		sayilar.add(54);
		sayilar.add(23);
		sayilar.add(67);

		Comparator<Integer> comp = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) {
					return -1;
				} else if (o1 > o2) {
					return 1;
				} else {
					return 0;
				}
			};
		};
		sayilar.sort(comp);
		System.out.println(sayilar);
	}

	private static void ornek1() {
		ArrayList<String> kisiler = new ArrayList<>();
		kisiler.add("Veli");
		kisiler.add("Mahmut");
		kisiler.add("Ali");

//		for (String kisi : kisiler) {
//			System.out.println(kisi);
//		}

		System.out.println(kisiler.stream().sorted());
		System.out.println(kisiler.stream().sorted().toList().toString());
	}
}
