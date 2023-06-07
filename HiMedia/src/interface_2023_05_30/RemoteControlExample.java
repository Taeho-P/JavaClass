package interface_2023_05_30;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-30);
		rc.turnOff();
	}
}
