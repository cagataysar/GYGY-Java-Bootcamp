package main;

public class Test {

	public static void main(String[] args) {

		Player player1 = new Player("Ali", 20, 12345678);
		Player player2 = new Player("Veli", 20, 12345678);
		Player player3 = new Player("Veli", 20, 1234567891);
		Player player4 = new Player("Mahmut", 20, 1234567891);

//		System.out.println(player1.equals(player2));  
//		System.out.println(player3.equals(player4));  

		long start = System.currentTimeMillis();
		System.out.println(player1.hashCode());
		System.out.println(player2.hashCode());
		System.out.println(player3.hashCode());
		System.out.println(player4.hashCode());

		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end - start);

	}

}
