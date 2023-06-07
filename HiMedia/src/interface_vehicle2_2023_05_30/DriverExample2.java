package interface_vehicle2_2023_05_30;

public class DriverExample2 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
