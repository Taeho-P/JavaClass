package class2023_05_02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iNum = sc.nextInt();

		System.out.println(iNum);

		double dDou = sc.nextDouble();

		System.out.println(dDou);

		String sStr = sc.next();

		System.out.println(sStr);

		char cChar = sc.next().charAt(0);

		System.out.println(cChar);

		int[] iNums = new int[5];

		String sStr2 = "";

		for (int i = 0; i < iNums.length; i++) {

			iNums[i] = sc.nextInt();

			if (i < iNums.length-1) {
				sStr2 += iNums[i] + ",";
			} else {
				sStr2 += iNums[i];
			}
		}
		System.out.print(sStr2);
	}

}
