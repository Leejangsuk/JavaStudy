package ex03_arithmetic;

public class Ex04_operator {

	public static void main(String[] args) {

		// 복합 대입 연산
		// +=, -=, *=, /= %=
		
		int wallet = 0;
		
		wallet = wallet + 30000; // 기존 wallet의 값을 30000 늘린다.
		
		wallet += 30000; // 기존 wallet의 값을 30000늘리는 동일한 코드.
		
		System.out.println(wallet);
		
		// 문제. money를 5% 늘려보자 (5%는 0.05)
		
		long money = 70000L;
		
		//money = money + (long)(money *= 0.05); // double(실수)타입을 long(정수)타입으로 casting
		//money += (long)(money *= 0.05); // 같은 코드
		//money = money * 1.05% //실수 연산 결과를 정수(long)타입에 저장 할 수 없다.
		
		money *= 1.05; // money(long)와 1.05(double)의 연산이므로 이때 money는 JVM에 의해서 double로 처리된다.

		System.out.println(money);
		
	}

}