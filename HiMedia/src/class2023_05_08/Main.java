package class2023_05_08;

public class Main {

	public static void main(String[] args) {

		int iN1 = (int) (Math.random() * 45) + 1;

		System.out.print(iN1 + " ");

		int iN2 = (int) (Math.random() * 45) + 1;
		while (true) {
			iN2 = (int) (Math.random() * 45) + 1;
			if (!(iN1 == iN2)) {
				break;
			}
		}

		int iN3 = (int) (Math.random() * 45) + 1;
		while (true) {
			iN3 = (int) (Math.random() * 45) + 1;
			if (!(iN1 == iN3) && !(iN2 == iN3)) {
				break;
			}
		}

		int iN4 = (int) (Math.random() * 45) + 1;
		while (true) {
			iN3 = (int) (Math.random() * 45) + 1;
			if (!(iN1 == iN4) && !(iN2 == iN4) && !(iN3 == iN4)) {
				break;
			}
		}

		int iN5 = (int) (Math.random() * 45) + 1;
		while (true) {
			iN3 = (int) (Math.random() * 45) + 1;
			if (!(iN1 == iN5) && !(iN2 == iN5) && !(iN3 == iN5) && !(iN4 == iN5)) {
				break;
			}
		}

		int iN6 = (int) (Math.random() * 45) + 1;
		while (true) {
			iN3 = (int) (Math.random() * 45) + 1;
			if (!(iN1 == iN6) && !(iN2 == iN6) && !(iN3 == iN6) && !(iN4 == iN6) && !(iN5 == iN6)) {
				break;
			}
		}
		
		System.out.print(iN2 + " ");
		System.out.print(iN3 + " ");
		System.out.print(iN4 + " ");
		System.out.print(iN5 + " ");
		System.out.print(iN6 + " ");
	}
}
