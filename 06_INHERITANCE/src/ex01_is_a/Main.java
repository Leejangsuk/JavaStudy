package ex01_is_a;

public class Main {

	public static void main(String[] args) {

		// 부모 클래스(super)의 동작은 확인해 볼 필요가 없다.
		
		Student student = new Student();
	//   (타입) (변수)
		
		student.eat();
		student.study();
		
		Alba alba = new Alba();
		
		alba.eat();
		alba.study();
		alba.work();
		
		
		// Student가 자식 클래스이기 때문에 Person의 기능까지 가져다 쓸 수 있음
		// 클래스 하나만 상속 가능하다.
	}

}
