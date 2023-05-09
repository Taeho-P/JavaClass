package class2023_05_08;

public class Main3 {

	public static void main(String[] args) {
		int[] num = new int[6];
		boolean f = false;

		do {
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) (Math.random() * 45) + 1;
			}

			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if (i != j && num[i] == num[j]) {
						f = true;
					}
				}
			}

		} while (f);
		
	}
}