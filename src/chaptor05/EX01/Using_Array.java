package chaptor05.EX01;

public class Using_Array {

	public static void main(String[] args) {

		//기본 자료형인 경우 : RAM메모리에 Stack영역에 변수와 같이 저장
		//참조 자료형인 경우 : RAM메모리에 Stack 영역에 변수명이 저장이 되고
		
		//배열 (Array) : 하나의 [배열] 변수에 여러개의 값을 할당.
		// -- 1. 동일한 자료형의 값을 할당.
		// -- 2. 배열의 방의 크기를 지정하면 수정이 불가능.
		
		int[] a= new int[5]; //s응 참조변수 (참조 주소값을 가지고 있다.
		
		//배열 a 변수의 방의 크기 5개를 생성후 주소값을 a에 할당해라
				
		//방번호 [index] 0~4방까지 Heap 영역에서 생성됨
		//new : heap 영역의 배열 방 5개를 생성해서 Heap 영역의 번지를 a변수에 할당해라.
		
		
		//배열 변수의 값을 할당
		a[0]= 10; //Heap 영역의 index 0 방에 정수 10을 넣어라
		[1]= 10;
		[2]= 30;
		[3]= 40;
		[4]= 50;
		
			//배열 방의 값을 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("for문을 사용해서 배열 방의 값을 출력");
		
		for (int i=0; i<5; i++) {
			System.out.println(a[i]);
			
		}
		
		System.out.println("배열변수 a에 방의 갯수:" a.length); //배열방의 총 갯수

		tem.out.println("==for문에서 a.length를 사용해서 출력=="); //배열방의 총 갯수
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
