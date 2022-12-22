import java.util.Scanner;

class Main {

	public static String MathChallenge(String string) {
		int a = 0;
		int b = 1;
		int c = 0;

		int num = Integer.parseInt(string);

		while (c < num) {
			int i = a + b;
			a = b;
			b = i;
			c++;
			if (c == (num + 1)) {
				string = "yes";
				break;
			} else {
				string = "no";
				break;
			}
		}
		return string;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		//System.out.print(MathChallenge(s.nextLine()));
    Main.MathChallenge(s.nextLine());
	}

}