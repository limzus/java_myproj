package Ex05;

public class Using_while01 {
	public static void main(String[] args) {
		//while {
		// 실행문 ;
		//}
		
		//while 반복 횟수를 알수없는 경우 사용.
		//for 반복횟수를 알 수 있는 경우.
		
		
		
		//-- 초기값 선언을 반드시 while 밖에서 선언을 해야한다.
		// while 문 내에서 선언시 무한루프.
		//-- 증가값은 while 내에서 선언을 함. 증가값을 선언하지 않으면 무한 루프를 돔.
		
		//1. while 문에서 반복 횟수가 0인 경우
		
		int a= 0;  // 변수의 초기  값은 while 밖에서 선언
		while (a<0) { //false이므로 실행되지않음
		
			System.out.println(a+""); // 조건이 True일때만 실행.
			
		
		}
		
		//2. while문에서 반복횟수가 1번인 경우
		System.out.println("======반복 횟수 1========(증가값을 사용)");
		a=0;
		while (a==0 ) {
			System.out.print(a+ "");
			a++;
		}
		System.out.println(); //enter
		System.out.println("====반복횟수 10");
		
		a= 0;						//초기값 : while밖에서 선언
		while (a<10) {
			System.out.println(a+" ");
			a++ ; 						//증가값은 while내에서 처리
		}
		
		System.out.println();
		System.out.println("=====초기값을 while 문내에 넣는 경우:<무한루프>");
		
		int b;
		while (b<10) {
			b=0;
			System.out.println(a+" ");
			a++ ; //증가값은 while내에서 처리
			
			//while문에서는 조건을 생략할수 없다.
			//for문은 조건을 생략시 무한루프를 돈다.
			//while문에서 무한루프를 돌릴때 조건에 True
			
			System.out.println();
			System.out.println("============");
			
			boolean c;
			c= true;
			while (c) {
				System.out.print(c+" ");
				c++;	
				if (c>200) {
					break;
				}
			
			}
		}
		
		
		
	}

}
