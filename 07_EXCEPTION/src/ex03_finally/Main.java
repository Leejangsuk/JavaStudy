package ex03_finally;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// finally 블록
		// 항상 마지막에 반드시 실행되는 블록
		
		Scanner sc = new Scanner(System.in);
		
		try {
						
			System.out.println("나이를 입력하세요 >>>");
			int age = sc.nextInt();
			
			if(age < 20)
				System.out.println("술 담배 판매금지");
			else
				System.out.println("술 담배 판매 가능");
		}catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}finally {
			sc.close();
		}
			
		
	}

}
