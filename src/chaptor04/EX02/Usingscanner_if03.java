package chaptor04.EX02;

import java.util.Scanner;

public class Usingscanner_if03 {

	public static void main(String[] args) {
	//if문에서 String 문자열 비교.
		// --기본자료형에서 변수의 값이 같다 : ==
		// --참조자료형에서는 변수의 값이 같음을 표현할때 변수명.equals("값")
		Scanner sc = new scanner(System.in); //sc 객체 생성
		// 		String 변수의 값을 비교할때 : equals() 메소드를 사용해야한다.
		System.out.println("주문할 커피 메뉴를 고르세요>>>");
		String order = sc.next();
		
		if (order.equals("아메리카노")) {

			{			System.out.println("당신이 주문한 커피는 : "+order+ "입니다");
		} else if (order.equals("카푸치노")) 
			System.out.println("당신이 주문한 커피는 : " + order+ "입니다");
		} else if (order.equals("카페라떼") || order.equals("카페라떼")
				

}
