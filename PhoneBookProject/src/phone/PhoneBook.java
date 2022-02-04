package phone;

import java.util.Scanner;


public class PhoneBook {
		
	private Scanner scanner;
	private Phone[] pArray;
	
	public PhoneBook() {
		scanner = new Scanner(System.in);
	}
	
	private void input() {
		System.out.println("인원수 >>>");
		int count = scanner.nextInt();
		pArray = new Phone[count];
		
		for(int i = 0; i < count; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>>");
		//입력받은 이름과 전화번호를 입력하는 방법 
		//1. 컨스트럭트 방식 -> new phone(@@, @@@);
		//2. new phone(); set Name(), set Tel(); 
			
			String name = scanner.next();
			String tell = scanner.next();
			// 1. 생성자
			pArray[i] = new Phone(name, tell);
			
			// 2. setter
		/*	pArray[i] = new Phone();
			pArray[i].setName(name);
			pArray[i].setTell(tell);*/
		
		}
		System.out.println("저장되었습니다.");
	}
	
	private String search(String name) {
		for(int i = 0; i < pArray.length; i++) {
			if(name.equals(pArray[i].getName()))
				return pArray[i].getTell();
		}
		return null;	
	}
	
	public void run() {
		input();
		while(true) {
			System.out.print("검색할 이름 >>>");
			String name= scanner.next();
			if(name.equals("exit")) { // 대소문자 구분없이 입력받을 경우 -> if(name.equalsIgnoreCase("exit"))
				System.out.println("프로그램 종료");
				return; // break;
				//return -> run 메소드 종료
				//break -> while문 종료
			}
		
			String tell = search(name);
			if(tell == null)
				System.out.println(name + "이 없습니다.");
			else
				System.out.println(name + "의 번호는" + tell + "입니다.");
			
		}
	}
	
}	
/*	private Phone[] phone;
	private int idx;
	
	//1. 이름 전화번호 입력 받음
	private void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 >>");
		
		int man = sc.nextInt();
		int[] arr = new int[man];
		
		for(int i=0; i<=man; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("이름과 전화번호를 입력하세요 : ");
			
			arr[i] += sc2.nextInt();
		}	
	}
	
	//2.매개변수로 검색할 이름 전달 받아서 해당 전화번호와 이름 반환, 해당 이름 없으면 null 반환
	private String search(String name) {
		
		
		
		
		return name;
	} */
	
