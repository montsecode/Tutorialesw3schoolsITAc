//Java HashMap
/**
 * 
 * Java HashMap
 * In the ArrayList chapter, 
 * you learned that Arrays store items as an ordered collection, 
 * and you have to access them with an index number (int type).
 * A HashMap however, store items in "key/value" pairs, 
 * and you can access them by an index of another type (e.g. a String).

 * One object is used as a key (index) to another object (value).
 * It can store different types: String keys and Integer values, 
 * or the same type, like: String keys and String values:
 * 
 * 
 * 
 */

//Example
/**
 * 
 * Create a HashMap object called capitalCities that 
 * will store String keys and String values:
 * 
 * import java.util.HashMap; // import the HashMap class
 * HashMap<String, String> capitalCities = new HashMap<String, String>();
 * 
 * 
 * Add Items
 * The HashMap class has many useful methods. 
 * For example, to add items to it, use the put() method:
 * 
 * 
 */
//Example

package w3schoolsITA;
//// Import the HashMap class
import java.util.HashMap;


public class MyClass8 {

	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA","Washington DC");
		System.out.println(capitalCities);

	}

}
