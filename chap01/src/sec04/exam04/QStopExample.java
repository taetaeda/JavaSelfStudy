package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");
		//system.in.read를 통해 알파벳 키코드를 읽을 수 있어도, 두개 이상 글자가 조합된 한글은 읽지 못한다.
		//한글을 읽어내기 위해서는, scanner를 사용하면 된다.

	}

}
