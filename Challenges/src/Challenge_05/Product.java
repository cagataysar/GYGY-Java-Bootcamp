package Challenge_05;

import java.util.Scanner;

public class Product extends Order {

	protected String productName;
	protected int productPrice;
	static double productTax;
	Order order1;

	public Product() {

	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public static void giveOrder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose your order: " + "Tea(1)" + "Coffee (2)" + "Water (3)");

		int select = scanner.nextInt();

		switch (select) {
		case 1:
			productTax = 0.5d;
			calculateTax(productTax);
			break;
		case 2:
			productTax = 0.8d;
			calculateTax(productTax);
			break;
		case 3:
			productTax = 0.1d;
			calculateTax(productTax);
			break;
		default:
			break;
		}
	}

	public static double calculateTax(double productTax) {

		return productTax;
	}

}
