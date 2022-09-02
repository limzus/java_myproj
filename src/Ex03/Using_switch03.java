package Ex03;

import java.util.Scanner;

public class Using_switch03 {

	public static void main(String[] args) {
		/*1 문제
		 	스캐너로 "Gold"를 넣으면 "금메달입니다"를 출력
		 	스캐너로 "Silver"를 넣으면 "은메달입니다"를 출력
		 	스캐너로 "Bronze"를 넣으면 "동메달입니다"를 출력 그외는 "메달이 없습니다."
		 
		 
		 
		 */
		//1
		//Scanner sc = new Scanner(System.in);
		//System.out.println("당신의 메달!! (금,은,동 선택)");
		//String aa= "금"; String bb= "은"; String cc= "동";
		//int dd=1;
		//int ee=0;
		//if (aa, bb, cc= dd) {
			
		//}
		
		//1.1
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 메달!!(금,은,동 선택)");
		
		String aa= sc.next();
		switch(aa) {
		case "금": 
		System.out.println("금메달입니다.");
		break;
		case "은":
		System.out.println("은메달입니다.");
		break;
		case "동":
		System.out.println("동메달입니다.");
		break;
		default:
		System.out.println("메달이 없습니다.");
		}
		
		//2.문제
	 	//스캐너로 월을 인풋받아서 해당월의 총 날짜를
	 	//"<월>은 <몇일> 일까지 있습니다."
	 	//<완료시간 12:00까지
		
		System.out.println("월");
		
		
		
		
		
		
		// 1 31 2 28 3 31 4 30 5 31 6 30 7 31 8 31 9 30 10 31 11 30 12 31
		
		
		
		
		
		
		
		
		
		
		
		
		
	
			
		
		
		

	}

}
