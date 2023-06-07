package animal_2023_05_26;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		Animal animal = null;
		animal = new Dog();
		animal.sound();
//		animal.bite();
		Dog animal1 = (Dog)animal;
		animal1.bite();
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
