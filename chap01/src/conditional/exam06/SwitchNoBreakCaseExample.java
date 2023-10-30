package conditional.exam06;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		int time = (int) (Math.random()*4)+8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다");
			case 9:
				System.out.println("회의합니다");
			case 10:
				System.out.println("업무");
			default:
				System.out.println("외근");
				
				//break가 없어서 다음 case 까지 차례로 실행
		}
	}

}
