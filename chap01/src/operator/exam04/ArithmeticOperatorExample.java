package operator.exam04;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println(result1);
		
		int result2 = v1 - v2;
		System.out.println(result2);
		
		int result3 = v1 * v2;
		System.out.println(result3);
		
		int result4 = v1 / v2;
		System.out.println(result4); //int 타입이니까 2.5가 아니라 2가 나올 것이다.
		
		int result5 = v1 % v2;
		System.out.println(result5); // 1
		
		double result6 = (double) v1 / v2;
		System.out.println(result6);

	}

}
