package JavaPractice.JavaPractice;

public class MethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=11;
		int b=2;
		
		float x=14.5f;
		float y=2.2f;
		
		
		System.out.println(addNumbers(a,b));
		System.out.println(addNumbers(x,y));
		System.out.println(addNumbers(a,y));

	}
		
	public static int addNumbers(int a, int b) {
		return a + b;
	}

	public static float addNumbers(float a, float b) {
		return a + b;
	}

	public static float addNumbers(int a, float b) {
		return a + b;
	}
	
	public static float addNumbers(float a, int b) {
		return a + b;
	}

	public static float addNumbers(int a, int b, float c) {
		return a + b + c;
	}
}


