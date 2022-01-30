package test;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//커피메뉴를 입력받아 가격을 알려주는 프로그램을 구현하시오. switch문을 이용하여 구현하시오
// (에스프레소,카푸치노,카페라떼는3500원,아메리카노는2000원이다.)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴를 주문하세요 >>> ");
		String order = sc.next();
		int price = 0; // price의 초기값 0
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500; // 에스프레소, 카푸치노, 카페라떼 3500 설정
			break;
		case "아메리카노":
			price = 2000; // 아메리카노 2000 설정
			break;
		default: // case 마침 
			System.out.println(order + "는 없는 메뉴 입니다.");
		}
		if(price != 0) // price의 값이 0이 아니라면
			System.out.println(order + "는 " + price + "원 입니다.");
		
		sc.close();
		
	}

}
