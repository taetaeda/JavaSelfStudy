package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;		// '큰 타입 = 작은 타입' 있으면 자동으로 형변환 된다
		intValue = (int) longValue; // '작은 타입 = 큰 타입' 있으면 큰 타입을 강제로 형변환 해줘야 한다
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
	}

}
