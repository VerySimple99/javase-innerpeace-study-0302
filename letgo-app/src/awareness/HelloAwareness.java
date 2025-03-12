package awareness;


import model.Car;
import model.Note;


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
		System.out.println(car.getName()+" "+car.getPrice()+" volvo");


		Note note = new Note("매순간 감사",77);
		System.out.println("note "+note+" "+note.getTitle()+" "+note.getPageNo());
		
		House house = new House();
		System.out.println("house : "+ house);


	}
}
