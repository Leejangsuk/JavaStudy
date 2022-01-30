package test;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//점수와 학년을 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
//4학년인경우70점이상이어야합격이다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		System.out.println("학년을 입력하세요");
		int year = sc.nextInt();
		
		if(score >= 60) { // score가 60보다 높거나 같으면
			if(year != 4) // year != 4 // 4학년 제외
				System.out.println("합격"); 
			else if(score >= 70) // 또는 70점보다 높거나 같으면
				System.out.println("합격"); // 합격
			else
				System.out.println("불합격");
		}
		else {
			System.out.println("불합격");		
		}
		sc.close();
		
		}

		}
	

