package Ex04;

public class Using_for06 {
public static void main(String[] args) {
	
	//for문에서 무한 루프가 발생시
	//그for (int i=0 ; i<10 ; i++) {
		System.out.println(i);
	}
//	System.out.println("문자열 출력"); // 도달할 수 없는 코드
	
	//무한 루프를 탈출 하는 방법 : break; 사용
	//if문 내에 break;
	for (int i=0 ; i<10 ; i++) {
		System.out.println(i); //무한 루프
		
		if( i==100) { break;} //
	}

	
}
}
