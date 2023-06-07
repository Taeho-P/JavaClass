package super_method_call_2023_05_25;

public class SuperSupersonicAireplane extends SupersonicAirplane{
	public static final int SUPERSUPERSONIC = 3;

	public void fly() {
		if (flyMode == SUPERSUPERSONIC) {
			System.out.println("초초음속비행합니다.");
		} else {
			super.fly();
		}
	}
}
