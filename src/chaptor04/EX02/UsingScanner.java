package chaptor04.EX02;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//콘솔에서 인풋할때 : 공백으로 한꺼번에 변수값 할당.
			//엔터를 사용해서 하나씩 값 할당.
		
		//주의 : 자료형과 변수의 갯수에 잘 맞추어서 인풋.
		
	
		System.out.println("이름(문자열), 나이(정수), 몸무게(실수)" + 
		"공백으로 구분해서 입력하세요. >>>>");
		
		String aa = sc.next();	//콘솔 인풋, 문자열
		int bb = sc.nextInt();	//콘솔 인풋, 정수
		double cc = sc.nextDouble();	//콘솔 인풋, 실수
		
		
		
		String s = sc.next(); //문자열 변수 선언
		System.out.println("반드시 한 문자만 입력해 주세요>>>>');");
		char d = s.charAt(0) ;
		System.out.println("변수 d를 출력");
		
		
		
		
		
		System.out.printf(" 당신의 이름은 %s이고 나이는 %d이고, " 
		+ "당신의 몸무게는 %4.1f입니다. \n" , aa, bb, cc);
		System.out.print(" 당신의 이름은" + aa + "  나이는"+ bb + " 몸무게는" + cc + "입니다");
		
		System.out.println("당신의");
		

		
	}

}
