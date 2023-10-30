package operator.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------");
		
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("-----------");
		
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-----------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------------");
		z = ++x + y++; // x 15 y 9 z 23
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
