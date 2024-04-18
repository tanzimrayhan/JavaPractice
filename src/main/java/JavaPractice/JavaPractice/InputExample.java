package JavaPractice.JavaPractice;
import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("Press 1 for English ");
		System.out.println("Press 2 for Spanish ");
		
		String language=userInput.nextLine();
		
		if (language.equals("1")) {
			System.out.println("Hello");
		} 
		else if(language.equals("2")) {
			System.out.println("Hola");
		} 
		else {
			System.out.println("I do not understand the language you picked");
		}
	}

}
