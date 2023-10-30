package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		//float var1 = 3.14;
		//소수점 숫자는 실수로 인식한다. java에서 실수는 기본적으로 double로 해석한다. 
		//실수 리터럴을 float에 저장하고 싶다면 f를 붙여주자
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4); //0.12345679 올려짐
		System.out.println("var5: " + var5); //0.12345678901234568
											 //double타입인 var5가 float보다 정밀하게 출력되었다
		
		//e 사용하기
		double var6 = 3e6;  //e6은 10의 6승
		float var7 = 3e6F;
		double var8 = 2e-3; //e-3는 10의 -3승 //10만큼 소수점 하나씩 간다고 생각하면 0.002
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		
		
		
	}

}
