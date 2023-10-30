package operator.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		byte b = 100;
		//byte result3 = -b; //int이하 값은 자동으로 int 처리 되니까 byte 라고 말해주면 안되지
		// byte result3 = (byte)-b; // 이렇게 하는 방법도 있겠지만
		int result3 = -b; // 이 방법도 있다
		System.out.println(result3);

	}

}
