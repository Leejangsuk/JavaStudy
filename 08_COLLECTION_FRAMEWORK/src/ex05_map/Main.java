package ex05_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void hashmap1() {
	
		// HashMap 생성
		Map<String, String> dict = new HashMap<String, String>();
		
		// 추가1. 새로운 key 사용
		dict.put("apple", "사과");
		dict.put("banana", "바나나");
		
		// 추가2. 기존 key 사용
		dict.put("apple", "아이폰 만드는 회사");
		
		// 삭제
		String res = dict.remove("apple"); // 삭제할 요소의 '키'를 전달하면 삭제하고 해당 '값'을 반환한다.
		System.out.println(res);
		
		
		// 확인
		System.out.println(dict);
	}		

	public static void hashmap2() {
		
		// 국어, 영어, 수학 점수를 가지는 Map 생성하기
		
		// HashMap 생성
		Map<String, Integer> score = new HashMap<String, Integer>();
		
		// 추가
		score.put("국어", 95);
		score.put("영어", 90);
		score.put("수학", 80);
		
		// '키'를 이용해서 '값'을 알아내기	
		System.out.println("국어 점수는 " + score.get("국어") + " 영어 점수는 " + score.get("영어") + " 수학 점수는 " + score.get("수학") + " 입니다.");
	}

	public static void hashmap3() {
		
		// Map의 순회
		// 1. 키를 모두 알아낸다.
		// 2. 알아낸 키를 이용해 값을 모두 알아낸다.
		
		String name = "이장석";
		int age = 24;
		double height = 168.6;
		
		Map<String, String> person = new HashMap<String, String>();
		person.put("name", name);
		person.put("age", String.valueOf(age));
		person.put("heigt", height + "");
		
		// 키를 모두 알아내기
		// 키는 Set 자료구조이다.
		Set<String> keys = person.keySet();
	
		// 키를 순회하면서 해당 키의 값을 알아내기
		for(String key : keys) {
			String value = person.get(key);		
			System.out.println("키 " + key + ", 값 " + value);
		}
		
	}

	public static void hashmap4() {
		
		// Map 순회-2
		// 1. '키'-'값'을 하나의 단위로 Entry라고 한다.
		// 2. 모든 Entry를 추출해서 '키', '값'으로 분리한다.
	
		String name = "이장석";
		int age = 24;
		double height = 168.6;
		
		Map<String, Object> person = new HashMap<String, Object>();
		person.put("name", name);
		person.put("age", age);
		person.put("height", height);
		
		// Entry 단위로 순회하기
		Set<Map.Entry<String, Object>> entries =person.entrySet();
		for(Map.Entry<String, Object> entry : entries ) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("키 " + key + "값 " + value);
		}
		/*
		for(Map.Entry<String, Object> entry : person.entrySet())
			System.out.println("키 " + entry.getKey() + ", 값 " + entry.getValue());
			*/
	}
	
	public static void quiz() {
		
		// 사원번호(int empNo), 부서명(String dept), 사원명 (String name)을 가지는
		// 사원(employee)을 Map으로 3명 만들고
		// ArrayList에 사원 (employee) 3명을 저장하시오.
		
		Map<String, Object> employee1 = new HashMap<String, Object>();
		employee1.put("empNo", 1000);
		employee1.put("dept", "영업");
		employee1.put("name", "이과장");
		
		Map<String, Object> employee2 = new HashMap<String, Object>();
		employee2.put("empNo", 1001);
		employee2.put("dept", "개발");
		employee2.put("name", "최대리");
		
		Map<String, Object> employee3 = new HashMap<String, Object>();
		employee3.put("empNo", 1002);
		employee3.put("dept", "기획");
		employee3.put("name", "박부장");
		
		List<Map<String, Object>> employees = new ArrayList<Map<String, Object>>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
			
	for(Map<String, Object> employee : employees)
		for(Map.Entry<String, Object> entry : employee.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
}

	// 이진 트리(binary tree)
	// 1. 모든 노드의 자식은 2개이다. (왼쪽, 오른쪽)
	// 2. 왼쪽은 작은 값, 오른쪽은 큰 값이 저장된다.
	public static void treemap1() {
		
		// TreeMap
		// 1. key를 기준으로 왼쪽은 작은 값, 오른쪽은 큰 값이 저장된다.
		// 2. 범위 연산(이상, 이하 초과, 미만)이 필요한 경우 사용한다.
		// 3. 자동으로 정렬되면서 저장된다.
		// 4. TreeMap 타입으로 선언함면 범위 연산을 쉽게 호출할 수 있다.
		
		TreeMap<Integer, String> people = new TreeMap<Integer, String>();
		
		people.put(24, "이장석");
		people.put(40, "김두환");
		people.put(60, "심민수");
		people.put(20, "김현수");
		
		// 확인 -> 자동으로 key의 크기 순으로 저장되어 있음.
		System.out.println(people);
		
		while(people.isEmpty() == false) { // while (!people.isEmpty()){
			Map.Entry<Integer, String> entry = people.pollFirstEntry();
			System.out.println(entry.getKey() + ":" + entry.getValue());
			
		}
	}

	public static void treemap2() {
		
		TreeMap<Integer, String> people = new TreeMap<Integer, String>();
		
		people.put(24, "이장석");
		people.put(40, "김두환");
		people.put(60, "심민수");
		people.put(20, "김현수");
		
		// 정렬할 때 decending 메소드를 사용
		// 사용할 때마다 정렬이 바뀜
		
		// people의 key순으로 내림차순 처리된 map
		NavigableMap<Integer, String> map = people.descendingMap();
		for(Map.Entry<Integer, String> entry : map.entrySet())
 			System.out.println(entry.getKey() + ":" + entry.getValue());
 
		// 다시 오름차순을 하려면? descendingMap 메소드를 다시 
		NavigableMap<Integer, String> map2 = people.descendingMap();
		for(Map.Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());
		
	}
	public static void main(String[] args) {
		treemap1();

	}

}
