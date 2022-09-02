package Ex07;

public class Using_Continue {

	public static void main(String[] args) {
		//continue : continue를 만나면 continue 아래의 코드를 실행하지않고 반복
		// - if문과 같이 사용됨.
		
		
		//1. 단일 Loop에서 continue
		//for (int i=0; i<10; i++) {   // 0~9: 10번
			//System.out.println("A");
		//continue;					 //구문을 빠져나가지않고
			//System.out.println("B"); //도달할 수 없는 코드.
		
		//}

		for (int i=0; i<10; i++) { // 0~9: 10번
			System.out.println("A");
		if (i%2==0) {continue;}
		}
			System.out.println("B");
			
			System.out.println("===========================================");
			for (int i = 0 ; i<10; i++) {
			if (i==5 || i==7) {continue; }	
				System.out.println(i+ " ");
			}
	}

	}
