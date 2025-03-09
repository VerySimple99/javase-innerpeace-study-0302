package awareness;


import model.Car;
import model.House;
import model.Note;
import model.Oneness;
import model.SimpleLife;


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


		Note note = new Note("매순간 감사"); 
		System.out.println("note "+note+" "+note.getTitle());
		
		House house = new House(); 
		System.out.println("house : "+ house);

		Oneness oneness = new Oneness();
		System.out.println("oneness :"+ oneness);
  
		SimpleLife simpleLife = new SimpleLife("지금에 있음");
		System.out.println(simpleLife.getTitle());
	}
}
