package ex02_loop;

public class Ex04_break {

	public static void main(String[] args) {
		
		// break
		// 1. switch문을 종료할 때 사용
		// 2. 반복문(for, while)을 종료할때도 사용한다.
		
		// 모금 목표 : 10000원
		// 13원씩 모금
		
		int total = 0;
		int peple = 0;
		int money = 13;
		
		
		while(true) {
			if(total > 10000)
		break;
			total += money;
			peple++;
		}
		System.out.println("최종 모금액은 " + total + "원 입니다. ");
		System.out.println("최종 모금 인원은 "+ peple + "명 입니다.");
		
		
		// 전체 구구단 코드
		// 기존 코드는 수정하지 말고,
		// 새로운 코드를 추가해서 5x5=25
		int dan, n;
		
		outer : for(dan = 2; dan <=9; dan++) { // 2부터 9까지 출력
			for(n = 1; n <=9; n++) { //1부터 9까지 출력
				System.out.println(dan + "x" + n + "=" + dan * n);
				if(dan == 5 && n == 5) // dan도 5, n도 5일때 && 양쪽다 true이므로 출력
					break outer;						
			}
		}
				
	}

}
