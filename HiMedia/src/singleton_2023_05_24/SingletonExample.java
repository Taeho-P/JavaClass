package singleton_2023_05_24;

public class SingletonExample {

	public static void main(String[] args) {
		
		
//		Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getsingleton();
		Singleton obj2 = Singleton.getsingleton();

		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
