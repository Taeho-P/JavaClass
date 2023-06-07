package class2023_05_10;

import java.util.Arrays;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = new int[3];

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("종합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		System.out.println("-----------------");

		String[] str = new String[3];
		str[0] = "A";
//		str[1] = "B";
		str[2] = "C";

		System.out.println(str[1]);
		
		
		String[] sA = {"A", "B", "C"};
		
//		sA[0] = "A";
//		sA[1] = "B";
//		sA[2] = "C";
		
		String[] sB = {"A", "B", "C"};
		
//		sB[0] = "A";
//		sB[1] = "B";
//		sB[2] = "C";
		
		System.out.println(sA);
		System.out.println(sB);
		
		if(Arrays.equals(sA, sB)) {
			System.out.println("같음");
		}
	}
}
