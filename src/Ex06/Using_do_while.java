package Ex06;

public class Using_do_while {

	public static void main(String[] args) {
		
		//while : 조건을 비교후 실행문을 실행;
		//do while : 1번은 실행후 조건을 비교후 실행;
		/*
		 while (조건) {
		  실행문;
		 */
		
		/*
		 do {
		 실행문}
		 {while (조건);
		 
		 
		 */
		
		
		
		//1. while vs do while 비교
		int a;
		a= 0;
		while (a<10) {
			System.out.println(a+ "=======while 문 (조건이 참일때만 실행)=========");
			a++ ;
		}
		
		System.out.println();
System.out.println("do while : 조건과 상관없이 실행문을 1번 실행후"+ ", 조건이 참이면 반복");
a=11;
do {
	System.out.println(a+" ");
	a++;
}while (a>10);


// while문과 do while문 10번 실행.
		


a=0;
while (a<10) {	
	System.out.println(a+" ");
	a++;	
}
			System.out.println();


			System.out.println("=====================");
	}

}
