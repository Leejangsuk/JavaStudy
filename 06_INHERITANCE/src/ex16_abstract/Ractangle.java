package ex16_abstract;

public class Ractangle extends Shape {

	private int width;
	private int height;
	
	public Ractangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}
	
}
