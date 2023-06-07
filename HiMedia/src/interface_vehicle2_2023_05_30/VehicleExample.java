package interface_vehicle2_2023_05_30;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
