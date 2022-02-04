package phone;

public class Phone {
	
	private String name;
	private String tell;
	
	public Phone(String name, String tell) {
		super();
		this.name = name;
		this.tell = tell;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

}
