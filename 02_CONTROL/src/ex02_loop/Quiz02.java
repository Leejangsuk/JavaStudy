package ex02_loop;

public class Quiz02 {

	public static void main(String[] args) {

		// 2x1=2 3x1=3 4x1=4 ... 9x1=9
		// 2x2=4 3x2=6 4=2=8 ... 9x2=18
		// ...
		
		/*
		for(int n = 2; n <= 9; n++){
			for(int b = 1; b <= 1; b++)
				System.out.print(n + "x" + b + "=" + (n * b) + "  ");
		2중 for문
		*/
		
		/*
		int n = 1;
		
		for(int dan = 2; dan <= 9; dan++)
			System.out.print(dan + "x" + n + "=" + dan * n + "  ");
		*/
		
		for(int n = 2; n <= 9; n++) {
			for(int b = 1; b <= 9; b++)
				System.out.print(n + "x" + b + "=" + n * b + "\t "); // \t : 탭 문자
		System.out.println();		
		}
		
		
		
	}

}
