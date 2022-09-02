package chaptor05.EX01;

import java.util.Scanner;

public class Using_Array13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//국어 80 영어 50 수학 77 과학88
	//<==전체라인을 인풋받아서 공백을 기준으로 잘라서 배열에 저장
		System.out.println("각 과목과 점수를 공백을 구분해서 넣으세요>>");
		String s = sc.nextLine()
				
		System.out.println(s);
		
		//공백을 기준으로 들어온 데이터를 잘라서 배열에 저장
		String [] arr; //배열 선언
		arr = s.split(""); //공백을 기준으로 잘라서 arr배열에 저장

		for (int i=0; i< arr.length; i++) {
			System.out.println(arr[i]); // String
		}
		
		//배열의 홀수 방의 값을 가지고와서 (정수) 값을 가져와서 합과 평균을 구한다.
		int b; //과목의 점수를 담는 변수
		int sum; //합을 구하는 변수
		for (int i=- ; i <arr.lengt; i++) {
			
			if (i%2 != 0) { //홀수방의 값만 가져온다.
		b= Integer.parseInt(arr[i]); //홀수방의 값만 b변수에 저장
		sum +=b;
		count++;
			
			}

	}
}


