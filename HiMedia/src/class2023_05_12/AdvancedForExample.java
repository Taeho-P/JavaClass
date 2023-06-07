package class2023_05_12;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		int sum2 = 0;

		// 향상된for문

		System.out.println("-향상된for문-");
		
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

		// 일반for문
		
		System.out.println();
		System.out.println("-일반for문-");
		
		for (int i = 0; i < scores.length; i++) {
			sum2 += scores[i];
		}

		System.out.println("점수 종합 = " + sum2);
		System.out.printf("점수 평균 = %.1f", (double) sum2 / scores.length);
		
		//홀수번째 학생들의 총점
		
		int sum3 = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(i == 0 || i%2 == 0) {
				sum3 += scores[i];
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("홀수번째 학생 점수 평균 = " + (double)sum3);
		
		//3,4,5번째 학생점수 총점
		
		int sum4 = 0;
		
		for (int i = 2; i < scores.length; i++) {
			sum4 += scores[i];
		}
		System.out.println();
		System.out.println("3,4,5번째 학생 점수 합 = " + sum4);
			
	}

}
