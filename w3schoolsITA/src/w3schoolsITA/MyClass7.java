//Example
/**
 *  
 * Sort an ArrayList of Integers:
 * 
 * 
 */

package w3schoolsITA;

import java.util.ArrayList;
import java.util.Collections;//Import the Collections class

public class MyClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>myNumbers = new ArrayList<Integer>();
		
myNumbers.add(33);
myNumbers.add(15);
myNumbers.add(20);
myNumbers.add(34);
myNumbers.add(8);
myNumbers.add(12);

Collections.sort(myNumbers);// Sort myNumbers

for(int i : myNumbers) {
	
	
	System.out.println(i);
		
		}
	}

}
