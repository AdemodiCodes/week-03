
public class MoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] products = new String[5];
		
		products[0] = "carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int [] multiplesOf3 = new int[10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i-1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
		
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println("Number: " + multiplesOf5[i]);
		}

	}
}
