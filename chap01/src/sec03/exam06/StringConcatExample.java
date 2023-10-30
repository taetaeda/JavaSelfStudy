package sec03.exam06;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자 연산
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		//문자열 결합 연산
		String str1 = 10 + 2 + "8";
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2: " + str2);
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3: " + str3);
		//1010을 예상했지만 틀리다
		//먼저 수행된 연산이 결합연산이기 때문에 뒤도 결합연산으로 이루어진다.
		
		String str4 = "10" + (2+8);
		System.out.println("str4: " + str4);
	}

}
