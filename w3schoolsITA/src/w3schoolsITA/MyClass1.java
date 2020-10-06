package w3schoolsITA;
import java.util.Scanner;
//In the example below, we use different methods to read data of various types:

public class MyClass1 {
	 public static void main(String[] args) {
		// Create scanner object
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter name, age and salary: ");
		
		//String input
		String name = myObj.nextLine();
		
		//Numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		
		//Output input by user
		System.out.println("Name: "+name);
		System.out.println("Age: " +age);
		System.out.println("Salary: +salary");
		
	}
	
}
