



//Java User Input (Scanner)

/**
 * Java User Input
*The Scanner class is used to get user input, 
*and it is found in the java.util package.

*To use the Scanner class, 
*create an object of the class and use any of the available methods
*found in the Scanner class documentation. In our example, 
*we will use the nextLine() method, which is used to read Strings:

 * 
 * 
 * 
 * 
 */

//Import the Scanner class
package w3schoolsITA;
import java.util.Scanner;


 public class MyClass {



	 public static void main(String[] args) {
	 
		// Create scanner object
		
		Scanner myObj = new Scanner(System.in);
		 
		System.out.println("Enter username");
		//Read user input
		String userName = myObj.nextLine();
		System.out.println("Username isd: " + userName);
		
	}

}

