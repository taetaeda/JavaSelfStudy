package operator.exam07;

public class CompareOperatorExample1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		System.out.println(result1);
		
		boolean result2 = (num1 != num2); 
		System.out.println(result2);
		
		boolean result3 = (num1 <= num2);
		System.out.println(result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println(result4); // 유니코드로 int 타입 변환되면서 비교하게 될 것이다.

	}

}
