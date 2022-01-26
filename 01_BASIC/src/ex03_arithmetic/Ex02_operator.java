package ex03_arithmetic;

public class Ex02_operator {

	public static void main(String[] args) {

		// 1씩 증가 / 감소하기
		
		int a = 10;
		int b = 10;
		
		int res1 = a++; // a를 rse1에 저장한 뒤 a를 1 증가한다. (선 사용 후 증가)
		int res2 = ++b;  // b를 1 증가시킨 뒤 res2에 저장한다. (선 증가 후 사용)
		
		System.out.println(a);
		System.out.println(res1);

		System.out.println(b);
		System.out.println(res2);
	
		//현재 a는 11, b는 11이다.
		
		int res3 = a--; // a를 먼저 res3에 저장하고 1 감소시킨다. (선 사용 후 감소)
		int res4 = --b; // b를 1 감소시킨 뒤 res4에 저장한다. (선 감소 후 사용)
		
		System.out.println(a);
		System.out.println(res3);
		
		System.out.println(b);
		System.out.println(res4);
		
		// 현재 a는 10, b는 10이다.
		
		int res5 = a++ + --b;
		System.out.println(a); // 선사용 11
		System.out.println(b); // 선감소 9
		System.out.println(res5); // 10 + 9
		
		
	}

}
