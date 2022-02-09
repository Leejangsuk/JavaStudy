package ex04_has_a;

public class Main extends Tv{

	public static void main(String[] args) {

	Tv tv = new Tv();	
	
	tv.up();
	tv.down();
	
	///////////////
	
	Remocon remocon = new Remocon();
	Radio radio = new Radio(remocon);
	
	radio.up();
	radio.down();
		
	}

}
