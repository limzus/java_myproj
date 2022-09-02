package Ex05;

import java.util.Scanner;

public class Using_while02 {

	public static void main(String[] args) {
		//스캐너를 사용해서 -1이 될때까지 정수값을 넣어서 평균
		Scanner sc = new Scanner(System.in);
		
		int count =0; // 정수가 입력되는 갯수를 카운트함. <평균>
		int sum =0; //입력받는 정수를 모두 더한 값
		int n = sc.nextInt(); // 콘솔에서 정수값을 입력받아 n변수에 할당.
		
		
		//반복횟수를 알 수없는 경우 : while
		while(n != -1) { //입력받은 정수값이 -1이 아니면 while문을 실행}
			sum +=n ;
			count++; //정수값을 count함.
			n=sc.nextInt(); // 콘솔에서 인풋을 받아서 sum에서 값을 할당받아서, -1이 정수값으로 input이되면 루프를 빠져나온다.
		}
		
		if (count==0) { //제일 처음에 정수값을 -1
			System.out.println("입력된 정수가 없습니다.");
			
		}else { //정수값을 하나이상 넣은경우
			System.out.println("입력된 정수는: " + count +"개입니다.");
			System.out.println("입력된 정수의 합은:" + sum + "입니다.");
			System.out.println("평균은:" +sum /(double) count);
			
		}
	}

}
