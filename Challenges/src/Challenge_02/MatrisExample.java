package Challenge_02;

public class MatrisExample {
	// 1 2 3 -> 9 8 7
	// 4 5 6 -> 6 5 4
	// 7 8 9 -> 3 2 1
	// arrayFlip1();
	
	public void arrayFlipMatris() {
		int[][] list = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("List length: " + list.length);
		  
		System.out.println("Dizi: ");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.print(list[i][j]);
			}
			System.out.println();
		}
		System.out.println("Çıktı: ");
		for (int i = list.length - 1; i >= 0 ; i--) {
			for (int j = list.length - 1; j >= 0 ; j--) {
				System.out.print(list[i][j]);
			}
			System.out.println();
		}	
	}
}
