package ex22_Object;

public class User {
	
	private String userId;	
	private String userPw;
	
	public User(String userId, String userPw) {
		super();	// Objec 클래스의 생성자 호출
		this.userId = userId;
		this.userPw = userPw;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}


	// Object 클래스의 equals 메소드 오버라이드
	@Override
	public boolean equals(Object obj) {
		return this.userId.equals(((User)obj).getUserId());
}
	// Object 클래스의 toString 메소드 오버라이드	
	@Override
	public String toString() {
		return "id : " + userId + ", pw: " + userPw;
	}
}
