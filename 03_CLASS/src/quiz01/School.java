package quiz01;

public class School {

	// 필드
	
	private String name;
	private String location;
	
	// 생성자
	public School() {
	}
	public School(String name, String location) {
		this.name = name;
		this.location = location;
	}
	//메소드
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
