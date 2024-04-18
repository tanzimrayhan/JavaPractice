package JavaPractice.JavaPractice;

import java.util.ArrayList;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] numbers = { 1, 2, 3,3,4 ,1};
			ArrayList<Character> list = new ArrayList<Character>();
			System.out.println(numbers[10]);
		} catch (Exception e) 
		{
			deleteFile();
			deletePassword();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public static void deleteFile() {
		System.out.println("File deleted");
	}
	
	public static void deletePassword() {
		System.out.println("Password deleted");
	}

}
