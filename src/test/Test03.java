package test;

import java.util.Scanner;

public class Test03 {


	public static void main(String[] args) {
			System.out.println("크기가 다른 구구단 숫자 입력 :");
			while(true) {
			Scanner scanner = new Scanner(System.in);
			String inputValue = scanner.nextLine();
			
			String[] splitedValue = inputValue.split(",");
			
			int first = Integer.parseInt(splitedValue[0]);
			int second = Integer.parseInt(splitedValue[1]);
			
			if(first >1 && second >1) {
				for(int i=2; i<=first; i++)
					for(int j=1; j<=second; j++) {
						System.out.println(i+"*"+j+"= "+i*j);
					}
			}else {
				System.out.println("2이상 입력하세요");
			}
			
			}
			
			
	}

}
