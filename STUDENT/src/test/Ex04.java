package test;

import java.util.Scanner;

public class Ex04 {

		/* 정수를 몇개 저장할지(최대100개) 입력받아서 해당길이를 가진 배열을 생성하
고, 이곳에 1에서 100사이 범위의 정수를 랜덤하게 삽입하시오. 같은값은 생성하
지 못하도록 설정하고 생성된 배열을 출력하시오.*/
		
		// exists()
		// 1. 발생한 난수가 기존 배열에 존재하는지 확인하는 메소드
		// 2. 존재하면 true, 존재하지 않으면 false 반환
		
		public static boolean exists(int arr[], int from, int rand) {
			for (int i = 0; i < from; i++) {
				if (arr[i] == rand)
					return true; // 존재하면 true 리턴
			}
			return false; //존재하지 않으면 false 리턴
			}
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("몇 개의 랜덤을 생성할까요? >>>");
			int n = sc.nextInt();
			
			if (n <= 0 || n > 100) {
				System.out.println("다음에는 1~100사이로 입력하세요!");
				sc.close();
				return; // 프로그램 종료
			}
			
			int arr[] = new int[n]; // n개의 정수 x배열 생성
			
			for (int i = 0; i < arr.length; i++) {
				int rand = (int) (Math.random() * 100 + 1); // 1~100 범위의 난수
				if (exists(arr, i, rand)) { // 중복이 있다면
					i--; // 다시 난수를 발생시켜야 하므로 증가된 인데스를 취소시킴
					continue;
				}
				arr[i] = rand; // 난수를 배열에 저장
			}
			for (int i = 0; i < arr.length; i++) { 
				if (i==0)
					System.out.println(arr[i] + "\t");
				else {
					if (i % 10 == 0) // 10개 요소를 출력했다면
 						System.out.println(); // 다음 줄로 넘어가기
					System.out.println(arr[i] + "\t");
				}
			}
			
		sc.close();
		}
	}


