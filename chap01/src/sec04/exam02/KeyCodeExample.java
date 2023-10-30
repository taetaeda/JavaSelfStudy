package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	
		//CONSOLE에서 a를 입력하면 97 13 10 이 출력
	}

}
