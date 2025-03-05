package awareness;

import model.Car;

public class HelloAwareness {
	public static void main(String[] args) {
		System.out.println("Hello Awareness");
		System.out.println("main");
		System.out.println("Hello Awareness:)");
		System.out.println("하하하");
		System.out.println("car2");
		System.out.println("car3");
		System.out.println("note");
		System.out.println("oneness");
		Car car = new Car("k5",3500);
		System.out.println(car.getName()+" "+car.getPrice());
	}
}
