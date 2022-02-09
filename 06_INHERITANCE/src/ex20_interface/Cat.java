package ex20_interface;

//Pet 클래스 구현 : 애완동물이다.
//Walkable 인터페이스 구현 : 산책할 수 있다.	

public class Cat extends Pet implements Walkable {

	public Cat(String name) {
		super(name);
	}

}
