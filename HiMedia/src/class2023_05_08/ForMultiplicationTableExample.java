package class2023_05_08;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for (int m = 3; m<=4; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 5; n <= 7; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}

	}

}
