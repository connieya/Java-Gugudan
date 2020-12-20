package test;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<10; i++) {
			calculate(i);
		}
	}

	public static int[] calculate(int times) {
		int result[] = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
			System.out.println(result[i]);
		}
		return result;
	}
}
