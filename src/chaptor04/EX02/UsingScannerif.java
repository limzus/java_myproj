package chaptor04.EX02;

import java.util.Scanner;

public class UsingScannerif {

	public static void main(String[] args) {

		//문제: Scanner로 정수값을 인풋 받아서
		//문제 : Scanner로 국어점수(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를 인풋받습니다.
		//인풋받습니다.
		//if 문을 사용해서 평균이 90점이상이면 "A학점", 80점이상 : "B학점"
		//70점 이상 : c학점, 60이상 : "D학점" , 나머지 : "F학점"
		
		Scanner sc= new Scanner (System.in);
				
				
		
		int aa = sc.nextInt();
		System.out.println("국어성적:" +aa);
		int bb = sc.nextInt();
		System.out.println("영어성적:" +bb);
		int cc = sc.nextInt();
		System.out.println("수학성적:" +cc);
		
		int dd = sc.nextInt();
		System.out.println("과학성적:" +dd);
		int ee = sc.nextInt();
		System.out.println("음악성적:" +ee);
		
		double ff = (aa+bb+cc+dd+ee) / 5.0 ; 
		System.out.printf("당신의 평균은 : %4.2f \n" , ff);
		if (ff >= 90) {
			System.out.println("당신은 A학점입니다.");
		}
		
		else if (ff >=80) {
			System.out.println("당신은 B학점입니다.");
		
		}else if (ff >70) {
			System.out.println("당신은 C학점입니다.");
		}else if (ff>70) {
				System.out.println("당신은 C학점입니다.");
			
			}else if (ff >60) {
				System.out.println("당신은 D학점입니다.");
			}else  {
				System.out.println("당신은 낙제입니다.");
			}else if ()
			
		}

		
	}


