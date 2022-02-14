import java.util.Scanner;

public class hw_2 {

	public static void main(String[] args) {
	
		final int questions = 3;					//Number of Questions
		String[] facts = new String[questions];		//Defining Array
		
		//Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input your information");
		
		//Student Name
		System.out.println("Name:");
		facts[0] = keyboard.nextLine();
		
		//Student Major
		System.out.println("Major:");
		facts[1] = keyboard.nextLine();
		
		//Student birthplace
		System.out.println("Birthplace");
		facts[2] = keyboard.nextLine();
		
		//Display student credentials
		System.out.println("\n" + "\n" + "\n" + "Your Student Info:" + "\n");
		System.out.println(facts[0]);
		System.out.println(facts[1]);
		System.out.println(facts[2]);
		
		//Close keyboard scanner to use less space
		keyboard.close();
		
		//Ending math equation
		int x = 8;
		int y = 5;

		System.out.println("\n" + x * y);
		
	}

}
