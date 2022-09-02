package Ex03;

public class Using_switch {

	public static void main(String[] args) {

		// switch 문 - 반드시 break;를 사용해서 해당 case를 탈출
		//해당 case로 점프후에 하위의 모든 case를 실행
		// break ;해당 실행문을 빠져 나온다.
		
		
		int a =2;
		
		switch (a) { //(위치변수) : 정수, 문자, 문자열
		case 1:
		System.out.println("변수값을 출력"+a);
		case 2:
		System.out.println("변수값을 출력"+a);
		case 3:
		System.out.println("변수값을 출력"+a);
		case 4:
		System.out.println("변수값을 출력"+a);
		default: // if문의 else와 같이 case의 값이 없는 모든 경우
		System.out.println("변수값을 출력"+a);
		
		
		
		}
		
		System.out.println("=========================");
		
		//2. switch 문에서 break; 사용 <== 일반적으로 사용
		
		a= 5;
		
		switch (a) { //(위치변수) : 정수, 문자, 문자열
		case 1:
			System.out.println("case1을 출력"+a);
		case 2:
		System.out.println("case2를 출력"+a);
		case 3:
		System.out.println("case3를 출력"+a);
			break;
		case 4:
		System.out.println("case4를 출력"+a);
			break;
			
		default: // if문의 else와 같이 case의 값이 없는 모든 경우
		System.out.println("default를 출력"+a);
			break; //default에서 break는 일반적으로 생략해서 사용한다.
		
		
		
		}
		
		//7점 이상인 경우 pass, 그렇지 않는 경우 fail
		System.out.println("===========================");
		int b = 8;
		
		switch (b) {
		case 10 :
			System.out.println("Pass");
			break;
		case 9:
			System.out.println("Pass");
		break;
			
		case 8:
			System.out.println("Pass");
		break;
	
		case 7:
			System.out.println("Pass");
		break;
		default:
			System.out.println("Fail");
			break;
		
		
		}
		
		System.out.println("==========축약표현============");
		
		//축약 표현
		b= 8;
		switch ( b ) {
		case 10: case 9: case 8: case 7:
			System.out.println("Pass");
			break;
		default :
				System.out.println("Fail");
				break;
		
		}
		
		//switch 문 <=======> if ~ else if 문과 상호 변환됨
		
		int c = 8;
		
		switch (c) {
		case 10: case 9: 
				System.out.println("A 학점");
				break;
		case 8 :
				System.out.println("B 학점");
				break;
		case 7 : 
				System.out.println("C학점");
				break;
		default:
			System.out.println("D학점");
		}
		
		//위 구문을 if else if 문으로 변환, break없이도 자동으로 구문을 빠져나옴.
		if (c<9) {
			System.out.println("A학점");
		}else if (c==8) {
			System.out.println("B학점");
		
		}else if (c==7) {
			System.out.println("C학점");
		}else if (c==8) {
			System.out.println("B학점");
		}
		
		
	
		
		
		
	}

}
