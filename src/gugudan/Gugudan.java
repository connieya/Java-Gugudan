package gugudan;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		
		
//		 	System.out.println("구구단 중 출력할 단은? :"); 
//		 	Scanner scanner = new Scanner(System.in); 
//		 	int number = scanner.nextInt();
//			 System.out.println(number+"*"+1+ "=" +number*1);
//			 System.out.println(number+"*"+2+ "=" +number*2);
//			 System.out.println(number+"*"+3+ "=" +number*3);
//			 System.out.println(number+"*"+4+ "=" +number*4);
//			 System.out.println(number+"*"+5+ "=" +number*5);
//			 System.out.println(number+"*"+6+ "=" +number*6);
//			 System.out.println(number+"*"+7+ "=" +number*7);
//			 System.out.println(number+"*"+8+ "=" +number*8);
//			 System.out.println(number+"*"+9+ "=" +number*9);
		 
		
		
//		  System.out.println("구구단 중 출력할 단은? :"); 
//		  Scanner scanner = new Scanner(System.in); 
//		  int number = scanner.nextInt(); 
//		  for(int i=1; i<10; i++) {
//		  System.out.println(number+"*"+i+"="+number*i); 
//		  }
		 
		
		System.out.println("구구단 중 출력할 단은? :");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number >=2 && number <=9) {
		int i=1;
		while(i<10) {
			System.out.println(number+"*"+i+"="+number*i);
			i++;
		}
		}else {
			System.out.println("2이상 9이하 숫자만 입력 가능합니다.");
		}
		
//		
//		for(int i=2; i<10; i++)
//			for(int j=1; j<10; j++) {
//			System.out.println(i+"*"+j+"="+i*j);
//		}

		
	}
	
	
}
