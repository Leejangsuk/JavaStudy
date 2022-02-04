package test;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* 돈을 입력받아 오만원권, 만원권, 오천원권, 천원권, 오백원동전, 백원동전,오
		십원동전 ,십원동전 ,오원동전 ,일원동전이 각각 몇개로 변환되는지 출력하시
		오. 이때 반드시 다음과 같은 배열을 사용하여 반복문으로 처리하시오. */

		
		
		//75832원
		
		//75832 / 50000 -> 1
		//75832 % 50000 -> 25832
		
		//25832 / 10000 -> 2
		//25832 % 10000 -> 5832
		
		int[] unit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 }; // 환산할 돈의 단위
		int[] count = new int[unit.length]; // 환산할 돈의  단위는 10개
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			count[i] = money / unit[i]; // unit[i]의 개수 계산
			
			// count[i]는 몫
			if (count[i] > 0) {
				System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");
				money = money % unit[i]; // money 갱신 (money %= unit[i]와 동일함)		
			}
		}
		sc.close();
	}

}
