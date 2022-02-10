package game;

import java.util.Arrays;

public class Player {

	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean turn() {
		int[] arr = new int[3]; // 길이가 3인 int 배열 생성
		for(int i = 0; i < arr.length; i++) { // 
			arr[i] = (int)(Math.random() * 6 ) +1; // arr[i]의 값에 주사위 값 저장
	}
		System.out.println("===" + name + "님의 주사위 결과===");
		System.out.print(Arrays.toString(arr)); // 배열 내용 출력
		if(arr[0] == arr[1] && arr[1] == arr[2]) { // 3개의 배열 0, 1, 2 비교후
			System.out.println(" 성공!"); // 같으면 성공
			return true;
		}else {
			System.out.println(" 실패!"); //아니면 실패
			return false;
		}
	}
	
}
