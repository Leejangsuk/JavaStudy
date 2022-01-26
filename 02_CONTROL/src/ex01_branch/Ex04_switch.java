package ex01_branch;

public class Ex04_switch {

	public static void main(String[] args) {

		// switch
		// 1. 표현식의 결과 값에 따른 분기를 처리한다.
		// 2. 표혀닉의 결과는 int, long, char, String이 가능하다.
		// 3. 표현식의 결과는 double, boolean이 불가능하다.
		
		// 짝수, 홀수
		int n = 90;
		switch(n % 2) {
		case 0: // n % 2의 결과가 0이면 여기서부터 실행하시오.
			System.out.println("짝수");
			break; // switch문을 종료하시오.
		case 1: // n % 2의 결과가 1이면 여기서부터 실행하시오.
				System.out.println("홀수");
		}
		
		// 3의 배수, 3의배수아님
		
		switch(n % 3) {
		case 0:
			System.out.println("3의배수");
			break;
		case 1:
		case 2:
			System.out.println("3의배수아님");
		}
		
		// 문제. 점수에 따른 학점 출력
		// 0 ~ 100 사이
		// 90 이상 : A
		// 80 이상 : B 
		// 70 이상 : C
		// 60 이상 : D
		// 60 미만 : F
		
	 int score = 0;
	 
	 switch(score / 10) {
	 case 10:
	 case 9:
		 System.out.println("A");
		 break;
	 case 8:
		 System.out.println("B");
		 break;
	 case 7:
		 System.out.println("C");
		 break;
	 case 6:
		 System.out.println("D");
		 break;
	 default: // 지금까지 만난 case 이외의 모든 경우
		 System.out.println("F");
		 
	 }
	 
		// 문제. 계절
	 int month = 12;
	 
	 switch(month / 1) {
	 case 12:
	 case 1:
	 case 2:
		 System.out.println("겨울");
		 break;
	 case 3:
	 case 4:
	 case 5:
		 System.out.println("봄");
		 break;
	 case 6:
	 case 7:
	 case 8:
		 System.out.println("여름");
		 break;
	 case 9:
	 case 10:
	 case 11:
		 System.out.println("가을");
	default:
		 System.out.println("잘못된 계절 입니다.");
	 }
		
		
		
		
		
		


	}

}
