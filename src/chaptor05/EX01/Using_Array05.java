package chaptor05.EX01;

public class Using_Array05 {

	public static void main(String[] args) {
		// 1~ 500까지 3의 배수를 배열에 저장
		// 출력 : 1. 직접 출력은 1개만, 2. for문을 사용해서 출력, 3. Enhanced for, 4. tostring()
		// 합계:, 평균:
		// <완료시간 : 11시 45분까지
		
		int aa[] = new int [500];	//
		int bb[] = new int [2];
		//3의 배수를 배열에 저장
		for (int i=0, j=3; i<500; i++,j+=3) {
			if(j<500) {
				aa[i]= j;
			}
		}
		//배열의 방을 출력
		for(int i=0 ; i<500; i++) {
			System.out.println(aa[i]);
		}

		
		
		
	}

}
