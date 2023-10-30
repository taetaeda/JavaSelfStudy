package operator.exam09;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'b'; // 여기에 집어넣어서 확인해본다.
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("대문자");
		}
		
		if((charCode>=97) && (charCode<=122)) {
			System.out.println("소문자");
		}
		
		if(!(charCode<48) && !(charCode>57)) {
			System.out.println("0-9 사이 숫자");
		}
		
		
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) { // 둘 다 만족해야돼
			System.out.println("2 또는 3의 배수네");
		}
		
		if((value%2==0) || (value%3<=0)) {
			System.out.println("2 또는 3의 배수다네");
		}
	}

}
