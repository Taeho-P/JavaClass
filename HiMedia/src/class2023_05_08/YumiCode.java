package class2023_05_08;

import java.util.Scanner;

public class YumiCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iC = sc.nextInt();

		String sStar = "";

		sc.close();

		for (int i = 0; i < iC; i++) {
			sStar += "*";
			System.out.printf("%s\n", sStar);
		}

	}
}
