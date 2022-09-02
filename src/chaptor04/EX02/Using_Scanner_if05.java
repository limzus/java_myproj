package chaptor04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {

		/*
		 나이(age)가 8세미만이면 : "취학 전 아동입니다"
		  					  "입장료는 <1000원>입니다.
		나이20세 미만이면 : "중, 고등학생입니다"
						"입장료는 <2500>입니다.
		나이20세이상이면  : "일반인입니다."
						입장료는 <3000원>입니다.
						
	<<18: 20분까지 완료>>>
		 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이age를 입력하시오");
		int age = sc.nextInt();
		int prise = 0;
		
		if (age <8   ) {
			System.out.println("취학전 아동입니다.");
			prise = 1000;  
			System.out.println(";
		}else if (age< 14 ) {
			System.out.println("초등 학생입니다.");
	    }else if (age< 14 ) {
		System.out.println("취학전 아동입니다.");

}
