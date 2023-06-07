package interface_2023_05_30;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.setVolume(8);
		tv.search("");
		tv.turnOff();
		
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.setVolume(8);
		rc.search("");
		rc.turnOff();
		
		Searchable serachable = tv;
		
		serachable.turnOn();
		serachable.setVolume(8);
		serachable.search("www.google.com");
		serachable.turnOff();
	}

}
