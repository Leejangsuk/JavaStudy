package ex01_primitive_array;

public class Ex01_array {

	public static void main(String[] args) {

		//배열
		// 1. 변수를 여러 개 모아 놓은 자료형이다.
		// 2. 참조 타입이다.
		// 3. 자동으로 0으로 초기화된다.
		// 4. 각 변수의 구분은 인덱(index)로 한다.
		// 5. 인덱스(index)의 시작은 0이다.
		
		int[] arr = new int[5]; // 메모리에 정수를 5개 넣으시오.
		
		arr[0] = 100; // 메모리에 100 저장
		arr[1] = 200; // 메모리에 200 저장
		
		System.out.println(arr[0]); // arr[index 값]
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
								
	}

}
