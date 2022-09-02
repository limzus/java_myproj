package Ex03;

public class Using_switch05 {
public static void main(String[] args) {
	/*
	 for (초기값 ; 조건 ; 증가값) {
	 	실행문1;           <=====조건이 참 일동안 계속 반복, 거짓이면 for을 빠져나옴
	 	
	 */
	
	int a ;
	for (a=0 ; a<3 ; a++) { // 초기값; 조건; 증가값
		System.out.println(a);
	} //0 1 2
		System.out.println("=========================");
	//초기값과 증가값에는 ,로 구분 해서 여러개의 변수가 올 수 있다.
		
	int b, c, d;
	for ( b=0, c=10, d=20; b<5; b++, c+=2, d+=5 ) { //5번반복(0,1,2,3,4)
		//b:1씩 증가, c:2씩 증가, d:5씩증가
	}
		System.out.println("b: "+ b + ",c:"+c+",d:"+d);

	/*	
	int e;
	for (e=10 ; e<10 ; e+= 3;) {
		
	}
		System.out.println(e); //조건이 True일 동안 반복
	
		//0 3 69

System.out.println("=====fpr문 없이 : 1 ~ 10까지 덧셈=========");
			//1부터 10까지 for 문 없이 덧셈

	int sum1 ; 
	sum1 = 0;  //0
	sum1 += 1; //sum1=sum1+1 //3
	
	sum1 += 2; //sum1=sum1+2 //6
	sum1 += 3; //sum1=sum1+3 //10
	sum1 += 4; //sum1=sum1+4 //15
	sum1 += 5; //sum1=sum1+5 //21
	sum1 += 6; //sum1=sum1+6 //28
	sum1 += 7; //sum1=sum1+7 //
	sum1 += 8; //sum1=sum1+8 //3
	sum1 += 9; //sum1=sum1+9 //3
	sum1 += 10; //sum1=sum1+10 //3
*/
		
		
		
		
		  
		
int sum2 ;
int h=0;
for (sum2 = 1 ; sum2 <=10; sum2++) {
	 h= h+sum2;  // 	
}
System.out.println("1부터 10까지의 합계 : " +h);

//for 문을 사용해서 0~ 1000까지 7의 배수의 합계
// 7의 배수의 합계:000 << 완료시간 14:50분>>
int sum3;
int k ;
for (k=7, sum3=0; k<=1000 ; k+=7) {
	sum3 += k;
}
System.out.println("1부터 10까지의 합계 : " +sum3);

// 답
int sum4 = 0;
for (int ii=1 ; ii <=10; ii++) {
	sum4 +=ii;
	if (ii <=9) {
		System.out.println("+");
		else {
			System.out.println()"=");
		}
	}
}

























}



	

}
