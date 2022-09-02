package Ex04;

import java.util.Scanner;

public class Using_for05 {
public static void main(String[] args) {
	//이중 for문을 사용해서 1단~ 9단까지 출력.
	/*
	 \n: enter, \t: tab
			1*1=1 1*2=2 1*3=3 .................. 1*9=9
	 		2*1=2 2*2=4 ................
	 		...
	 		9*1=9 9*2=18 ............... 1단~9단까지
	 		<완료시간: 17:45분까지>>
	 */
	for(int i=1; i<=9; ++i) {
		for(int j=1; j<=9; ++j) {
	int ij= i*j;
			System.out.println(ij);
			
			
		}
		
	}
			
	
	
	for(int i= ; i < 10; i++) {
		for (int j= 1; j<10 ; j++) {
				System.out.printf(i+ "*" + j+ i*j);
				System.out.printf("\t");
		}
	}
	
	
	System.out.println("================");
	
	//1단 ~ 19단까지 3의 배수만 출력
	
//	for(int l=1; l<20) {
//		for(int m=1; m<20; m++) {
//			int a; for(int mn=a; l<)
//			if(a=3*mn  ) {
				
//			}
//		}
//	}
	//===========================================
//	for (int i=1 ; i <=19 ; i++) {
//		for (int j = 1; j<= 19 ; j++)
//	}
	
	
	//스캐너에서 입력받은 단만 출력 (1~9단)
	//출력할 단을 입력 하세요. (1~9단)>>>
	//=========================
	//1*1=1
	//1*2=2
	//...........
	// 1*9=9
	
	
	// 구구단중 출력하고싶은 단을 넣으십쇼
	Scanner sc = new Scanner(System.in);
	System.out.println("구구단중 출력하고싶은 단을 입력하세요.");
	int aa = sc.nextInt();
	for(int a=1; a<=9; ++a) {
		aa=
	}
		for(int b=1; b<=9; ++b) {
			for(int )
		}
	}
	
}
}
