package class2023_05_04;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;

		while (true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if (keyCode == 113) {
				break;
			}
		}

	}

}