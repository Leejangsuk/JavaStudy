package ex01_exception;

import java.util.Scanner;

public class Main {

	public static void m1() {
		String[] hobbies = {
				"game ",
				"running",
				"swimming",
				null,
				"reading"
		};
		for(String hobby : hobbies) {
			if("reading".equals(hobby)) // if(null.equals("reading"))
				System.out.println("저와 취미가 같군요!.");
		}
			
	}

	public static void m2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 >>> ");
		String name = sc.nextLine();
		System.out.println("나이 >>>");
		String strAge = sc.nextLine();
		int age;
		if(strAge.isEmpty())
			age = 0;
		else
			age = Integer.parseInt(strAge);
		System.out.println("이름 " + name + " 나이 " + age);
		sc.close();
	}
	public static void main(String[] args) {
		m1();
		m2();
	}
	
}
