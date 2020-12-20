package test;

import gugudan.Gugudan;

public class GugudanMain {

	public static void main(String[] args) {
		int result[] = test.calculate(4);
		test.print(result);
		System.out.println("================");
		
		int[] times7 =  Gugudan.calculate(7);
		System.out.println(times7);
	}

}
