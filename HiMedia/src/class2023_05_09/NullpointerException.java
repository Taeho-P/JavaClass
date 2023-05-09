package class2023_05_09;

public class NullpointerException {

	public static void main(String[] args) {
		int[] inArray = null;
		inArray = new int[8];
		inArray[0] = 10;

		
		String str = null;
		String str1 = "Taeho";
		String str2 = new String("Taeho");
		System.out.println("총 문자수: " + str1.length());
	}

}
