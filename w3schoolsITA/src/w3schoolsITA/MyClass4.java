//You can also loop through an ArrayList with the for-each loop:



package w3schoolsITA;

import java.util.ArrayList;

public class MyClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		for(String i:cars) {
			System.out.println(i);
		}
	}

}
