package abstract_2023_05_26;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}
