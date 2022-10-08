package Challenge_02;

public class MatrisTranspose {

	public void arrayFlip() {

		int[][] list = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("List length: " + list.length);
		
		System.out.println("Dizi: ");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.print(list[i][j]);
			}
			System.out.println();
		}
		System.out.println("Dizinin transpozu: ");
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.print(list[j][i]);
			}
			System.out.println();
		}
	}

}
