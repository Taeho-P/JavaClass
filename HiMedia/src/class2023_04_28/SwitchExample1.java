package class2023_04_28;

public class SwitchExample1 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1:
			System.out.println("햄버거");
			break;
		case 2:
			System.out.println("짜장면");
			break;
		case 3:
			System.out.println("김밥");
			break;
		case 4:
			System.out.println("편의점");
			break;
		case 5:
			System.out.println("토스트");
			break;
		case 6:
			System.out.println("고기");
			break;
		}
	}

}
