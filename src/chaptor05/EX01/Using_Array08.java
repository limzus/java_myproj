package chaptor05.EX01;

public class Using_Array08 {

	public static void main(String[] args) {
		//배열 변수의 값 대입 방법 1
		// 배열을 선언 => 초기화 => 값을 대입
		// 선언과 초기화를 분리가능>>
		int [] arr1 = new int[3]; // index: 0,1,2
		
		int[] arr11; //선언
		arr11= new int [3]; //초기화
		
	arr1[0] =3;
	arr1[1]= 4;
	arr[2]=5
}

	//대입방법2 (주의: 방의 갯수는 지정하면 오류)
//         <<선언과 초기화 분리 가능>>
	int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10}; (//주의: 방의 갯수는 지정하면 오류)
	for (int i=0; i< arr2.length; i++) {
		System.out.println(arr2[i]);
	}
	
	//대입방법 3; (new int[])생략후 바로 값 할당.
	// -- 선엉과 초기화를 분리할 수 없다.
	int[] int arr3= {11,12,13,14,15}
;
	for (int i= 0; i < arr3.length ; i++) {
		System.out.println(arr3[i]);
		
	}
	
	int[] arr33 ;
	arr33 = {77,88,99} // 오류발생.
	
	/*
	
	