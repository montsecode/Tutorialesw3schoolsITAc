/**
 * Access an Item
*To access an element in the ArrayList, 
*use the get() method and refer to the 
*index number:
 * Example:cars.get(0);
 * Change an Item
*To modify an element, 
*use the set() method and refer to 
*the index number:
*cars.set(0, "Opel");
 * 
 * Remove an Item
*To remove an element, 
*use the remove() method and refer 
*to the index number:
 * cars.remove(0);
 * To remove all the elements in 
 * the ArrayList, use the clear() 
 * method:
 * cars.clear();
 * 
 * 
 * 
 */

//ArrayList Size
/**
 * To find out how many elements 
 * an ArrayList have, 
 * use the size method:
 * cars.size();
 * 
 * 
 */

//Loop Through an ArrayList
/**
 * Loop through the elements of an 
 * ArrayList 
 * @param args
 
*with a for loop, 
*and use the size() method to specify how many times the loop should run:

*
*
*
*
*/
package w3schoolsITA;
import java.util.ArrayList;

public class MyClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		for(int i=0; i< cars.size();i++) {
			System.out.println(cars.get(i));
		}
	
	
	}

}


