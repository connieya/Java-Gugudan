package test;

import java.util.Scanner;

public class Test02 {

	//크기가 다른 구구단 해당 숫자 까지 곱하는 단
	// 5를 입력하면 5단까지 있는데 5까지 곱합
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("숫자를 입력하세요: ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
				if(number>1) {
					for(int i=2; i<(number+1); i++) 
						for(int j=1; j<(number+1); j++) {
							System.out.println(i+"*"+j+"="+i*j);
						}
				}else {
					System.out.println("2이상 입력하세요");
				}
		}
		
		
		
			
		
	}

}
