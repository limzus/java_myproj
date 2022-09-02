package chaptor04.EX02;

import java.util.Scanner;

public class Using_scanner_if02 {

	public static void main(String[] args) {

		//점수(score)와 학년(year)을 인풋 받아서 60점이상이면 합격, 미만이면 불합격
		// 4학년인 경우 70점이상이면 합격, 중첩 if 문사용 (if내에 if문)

		if ( year != 4) {
			System.out.println("합격");
		}else if (score>=70) {
			System.out.println("합격");
		}else {System.out.println("불합격");
		}else {
			System.out.println("불합격");
		}
	}

}
