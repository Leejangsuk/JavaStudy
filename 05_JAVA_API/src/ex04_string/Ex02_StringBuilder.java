package ex04_string;

public class Ex02_StringBuilder {

	public static void main(String[] args) {

		// 1. String 클래스의 + 연산자
		String str1 = "";
		for(int i =0; i < 6; i++) //6번의 반복
			str1 = str1 + (int)(Math.random() * 10);
			//str1 += (int)(Math.random() * 10);
		System.out.println(str1);
		// 2. StringBuilder 클래스의 append 메소드
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 6; i++)
			sb.append((int)(Math.random() * 10));
		String str2 = sb.toString();
		System.out.println(str2);
		
		
		// 문제. 아래 출력물을 StringBuilder로 만들기
		// 1 2 3 4 5 6 7 8 9 10
		
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i <= 10; i++)
			sb1.append(i).append(" "); //메소드 이어 붙이기 : 메소드 체이닝
		String pageEntity = sb1.toString();
		System.out.println(pageEntity);
		
	}
}
