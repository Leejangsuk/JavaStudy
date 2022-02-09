package ex04_has_a;

public class Radio {

	private Remocon remocon; //null
	
	public Radio(Remocon remocon) {
		this.remocon = remocon;
	}
	public void up() {
		remocon.up();
	}
	
	public void down() {
		remocon.down();
	}
}
