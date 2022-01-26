package ex02_casting;

public class Ex02_parse {

	public static void main(String[] args) {

		// 1. "100" -> 100
		String str1 = "100";
		int a = Integer.parseInt(str1); // "100" 문장을 100 정수로 변환
		System.out.println(a); // 변환 후 출력
		
		// 2. "200" -> 200L
		String str2 = "200";
		long b = Long.parseLong(str2); // "100"문장을 long타입 100 정수로 변환
		System.out.println(b); // 변환 후 출력
		
		// 3. "1.5" -> 1.5
		String str3 = "1.5";
		double c = Double.parseDouble(str3); //"1.5" 문장을 double 타입 1.5 실수로 변환
		System.out.println(c); // 변환 후 출력
		
	}

}
