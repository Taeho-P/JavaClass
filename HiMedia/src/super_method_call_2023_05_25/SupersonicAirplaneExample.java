package super_method_call_2023_05_25;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		SuperSupersonicAireplane ssa = new SuperSupersonicAireplane();
		
		ssa.fly();
		ssa.flyMode = SuperSupersonicAireplane.SUPERSONIC;
		
	}

}
