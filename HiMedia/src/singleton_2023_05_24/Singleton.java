package singleton_2023_05_24;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {	
	}
	
	static Singleton getsingleton() {
		return singleton;
	}
}
