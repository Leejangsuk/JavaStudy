package ex18_interface;

// 인터페이스 Shape을 상속 받는다.(X)
// 인터페이스 Shape을 구현한다(O)

public class Rectangle implements Shape {
	
	private int width;
	private int hight;
	
	public Rectangle(int width, int hight) {
		super();
		this.width = width;
		this.hight = hight;
	}

	@Override
	public double getArea() {
		return width * hight;
	}

	@Override
	public void info() {
		System.out.println("너비 " + width + "높이 " + hight + "넓이 " + getArea());
		
	}
	
	

}
