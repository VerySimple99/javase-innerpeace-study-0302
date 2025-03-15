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
		System.out.println(car.getName()+" "+car.getPrice()+" k5");


		Note note = new Note("매순간 감사",77);
		System.out.println("note "+note+" "+note.getTitle()+" "+note.getPageNo());

		House house = new House("신봉");
		System.out.println("house : "+ house + house + house.getAddress());

		Oneness oneness = new Oneness("우연은 필연");
		System.out.println("oneness :"+ oneness+" message:"+oneness.getMessage());
  
		SimpleLife simpleLife = new SimpleLife("지금에 있음");
		System.out.println(simpleLife.getTitle());
		
		System.out.println("joy of being");
	}
}

