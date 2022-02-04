package test;

public class ex05 {

	public static void main(String[] args) {

		String[] names = {
				"뽀로로",
				"크롱",
				"에디"
		};
		
		int[] score = new int[names.length];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 101);
			
		}
		
		int total = score[0];
		int max = score[0];
		int min = score[0];
		int top = 0;
		int bottom = 0;
		
		for(int i = 1; i <score.length; i++) {
			total += score[i];
			if(max < score[i]) {
				max = score[i];
				top = i;
			}
			if(min > score[i]){
				min = score[i];
				top = i;
			}
		if(min > score[i]) {
			min = score[i];
			bottom = i;
			}
		}
			
		double average = (double) total / score.length;
		System.out.println("평균 : " + average + "점");
		System.out.println("1등 점수 : " + max);
		System.out.println("1등 이름 : " + names[top]);
		System.out.println("꼴등 점수 : " + min + "점");
		System.out.println("골등 이름 : " + names[bottom]);
		
	}

}
