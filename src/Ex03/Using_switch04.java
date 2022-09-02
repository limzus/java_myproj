package Ex03;

import java.util.Scanner;

public class Using_switch04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("달을 입력해주세요.");
	int aa= sc.nextInt();
	int bb= 0;
	
	switch(aa) {
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	bb= 31;
	System.out.printf("31일");
	break;
	case 4: case 6: case 9: case 11:
	bb= 30;
	System.out.printf("30일");
	break;
	default:
	bb= 28;
	}
	
	
	
}
	
}
