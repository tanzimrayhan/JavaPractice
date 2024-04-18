package JavaPractice.JavaPractice;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="Hello";
		
		System.out.println(text.length());
		
		int i=0;
		
		while (i < text.length()) {
			System.out.println(text.charAt(i));
			i++;
		}
	}

}
