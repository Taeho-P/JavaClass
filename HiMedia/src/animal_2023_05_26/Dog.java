package animal_2023_05_26;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	public void bite() {
		System.out.println("물어!");
	}
}
