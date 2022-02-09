package ex18_interface;

public interface Shape {
	
	// final 상수
	public final double PI = Math.PI;
	
	public double getArea(); // public abstract double getArea();
	//자체적으로 abstract 처리함
	public void info(); // public abstract void info();
	
	// default 메소드
	public default void message() {
		System.out.println("나는 도형입니다.");
		
	}

}
