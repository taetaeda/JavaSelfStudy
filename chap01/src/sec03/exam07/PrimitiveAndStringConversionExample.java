package sec03.exam07;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		//Integer.parseInt 와 String.valueOf 자주 나오니까 더 연습하기
		
		int value1 = Integer.parseInt("10");
		//10 이라는 문자열을 정수값으로 변환해주었다?
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		// true라는 단순 문자열을 boolean 값으로 변환
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(10); // 10이라는 값을 "10"이라는 문자열로 변환
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("문자열 str1: " + str1);
		System.out.println("문자열 str2: " + str2);
		System.out.println("문자열 str3: " + str3);
	}

}
