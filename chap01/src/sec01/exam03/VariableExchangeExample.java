package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" +y);
	
	int temp = x; //3이라는 x 값이 temp에 저장
	x = y; //5라는 y값이 x에 저장
	y = temp; //3이라는 temp 값이 y에 저장
	System.out.println(temp);
	System.out.println("x:" + x + ", y:" + y);
	// 최종적으로 x는 5, y는 3, temp = 3
	
	}
}
