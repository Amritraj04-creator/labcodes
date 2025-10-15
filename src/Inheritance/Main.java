package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome from Java");
		
		Car car = new Car();
		
		Cycle cycle = new Cycle();
		
		System.out.println("From Car");
		car.go();
		System.out.println("From Cycle");
		cycle.stop();
		
		System.out.println(car.wheels);		
		System.out.println(cycle.pedals);
	}
}
