package Ex07;

public class Using_Continue02 {

	public static void main(String[] args) {
		
		//1. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		// 3의 배수만 출력하세요.
	
		for(int a = 1 ; a<=1000 ; a++ ) {
			if (a%3 != 0) { continue;}
			System.out.println(a);
		}
		
		
		
		//2. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//5의 배수만 출력하세요
		for(int a= 1; a<=1000; a++) {
			if (a%5 != 0) {continue;}
			System.out.println(a);
		}
		
		
		
		

		
		//3. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		// 3, 5, 7의 배수만 출력하세요.
		for(int a=1; a<=1000; a++) {
			if(a%3!=0 & a%5!=0 & a%7!=0 ) {continue;}
		System.out.println(a);
		}
		//=======================================================/
		
		//3. for문을 사용해서 1에서 1000까지 1씩 증가하고 if를 사용해서
		//3,5,7의 배수만 출력하세요.
		System.out.println("===3, 5,7의 배수만 출력하기====");
		for(int a= 1 ; a<=1000; a++) {
			if(a*3=)
		}
		
		// <완료시간 16:00>
		
		//2. 다중 Loop에서 continue
		for (int i=0 ; i<5; i++) { //5번
			for (int k=0; k<5; k ++) { // 5번
				if (k=3) {continue; }
				System.out.println(i+","+k);
			}
			
			System.out.println("==========lable을 사용해서 점프함.===============");
			
			out:for (int i=0 ; i<5; i++) { //5번
				for (int k=0; k<5; k ++) { // 5번
					if (k=3) {continue; }
					System.out.println(i+","+k);
				}
				
				out:for (int i=0 ; i<5; i++) { //5번
					for (int k=0; k<5; k ++) { // 5번
						if (k=3) { 
							i=100;  //바깥쪽 for문의 변수값을 증대시켜서 false 빠져나옴
						continue; }
						System.out.println(i+","+k);
		}
		
		
		
					
	
		
	//향상된(enhanced) for문으로 배열의 모든 값을 출력
	// -- 배열의 모든 방을 순환하면서 출력,
	//-- 배열의 모든 값을  한꺼번에 출력됨.
	System.out.println("====향상된 for문을 사용해서 출력");
	for (int k : a) {
		System.out.println(k);
	}
		//Arrays.tostring(a)로 출력
		System.out.println("==Arrays.tostrung(a)===");
		
		System.out.println(Arrays.tostring(a));
		
		
	}
}
