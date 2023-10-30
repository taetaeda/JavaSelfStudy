package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); //%d는 정수
		System.out.printf("상품의 가격:%6d원\n", value); //6자리 정수인데 왼쪽 공백
		System.out.printf("상품의 가격:%-6d원\n", value); //6자리 정수인데 오른쪽 공백
		System.out.printf("상품의 가격:%06d원\n", value); //6자리 정수인데 왼쪽 빈자리를 0으로 채움

		double area = 3.14159 * 10 * 10; // 314.159
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);
		//소수점 위로 10개, 왼쪽은 공백으로, 소수점 아래로 2개까지, 나머지 값은 반올림?
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
		
	}

}
