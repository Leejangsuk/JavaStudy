package ex06_static;

public class CalulatorMain {

	public static void main(String[] args) {

		/*
		Calulator calc1 = new Calulator();
		calc1.add(1, 2);
		
		Calulator calc1 = new Calulator();
		calc1.add(1, 2);
		*/
		 
		// 인스턴스를 생성하지 않고 곧바로 호출하는 클래스 메소드

		Calulator.add(1, 2);
		
		Calulator.sub(2, 4);
		
		Calulator.mul(3, 4);
		
		Calulator.div(4, 2);
		
		Calulator.mod(5, 2);
		
		Calulator.pow(2, 3);
		
		Calulator.abs(-5);	
	}

}
