package phone1;

import java.util.Scanner;

public class PhoneBook {

	private Scanner scanner;
	private Phone[] pArray;
	
	public  PhoneBook() {
		scanner = new Scanner(System.in);
	}
	
	private void input() { // input 으로 입력
		System.out.println("인원수 >>>");
		int count = scanner.nextInt();
		pArray = new Phone[count]; // count 값을 pArray로
	
		for(int i =0; i < count; i++) {
			System.out.println("이름과 전화번호(이름과 번호는 공백없이 작성)>>>");
			
			String name = scanner.next();
			String tel = scanner.next();
			
			pArray[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다.");
		}
	
	private String search(String name) {
		for(int i = 0; i <pArray.length; i++) {
			if(name.equals(pArray[i].getName()))
				return pArray[i].getTel();
		}
		return null;
	}
	public void run() {
		input();
		while(true) {
			System.out.println("검색할 이름 >>>");
			String name = scanner.next();
			if(name.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				return;		
			}
			
			String tell = search(name);
			if(tell == null)
				System.out.println(name + "이 없습니다");
			else
				System.out.println(name + "의 번호는" + tell + "입니다.");
		}
	}
	
	
}
