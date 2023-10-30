package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); // 스캐너 생성
		String inputData; //inputData라는 문자 타입 변수 선언
		
		while(true) {
			inputData = scanner.nextLine(); // 입력된 내용을 문자열로 읽음
			System.out.printf("입력된 문자열: " + "%s", inputData);
			if(inputData.equals("q")) {
				// 문자열 String이 동일한지 비교할 때는 equals 사용
				// 기본 타입 동등 비교에는 ==
				break;
			}
		}
		System.out.println("종료");
		//종료를 밑으로 내리고 싶은데 어떻게 할까요?
	}

}
