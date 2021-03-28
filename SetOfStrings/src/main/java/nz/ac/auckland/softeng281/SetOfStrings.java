package nz.ac.auckland.softeng281;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A class to create a Set of Strings and to support set operations on these
 * SetOfStrings
 *
 * @author PARTHA ROOP
 */


public class SetOfStrings {
	private List<String> setv;

	/**
	 * create an empty SetOfStrings -- constructor
	 */
	public SetOfStrings() {
		setv = new ArrayList<>();
	}

	/**
	 * returns true if the SetOfStrings is an empty set false otherwise
	 */
	public boolean isEmpty() {
		return setv.isEmpty();
	}

	/**
	 * returns the size of the set
	 */
	public int size() {
		return setv.size();
	}

	/**
	 * Checks if a given String argument is a member of the set. return true if
	 * 'element' is a member of the set; false otherwise.
	 *
	 * @param element a String
	 */
	public boolean isMember(String element) {
		
		if(setv.contains(element)) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * return an enumeration of the elements of this SetOfStrings
	 */
	public Enumeration<String> elements() {
		return Collections.enumeration(setv);
	}

	/**
	 * insets a String 'newElement' to the set. care should be taken to insert so
	 * that the property of set is not violated after insertion.
	 *
	 * @param newElement a String
	 */
	public void insertElement(String newElement) {
			setv.add(newElement);
		
	}

	/**
	 * deletes a string 'element' from the set if 'element' is not a member of the
	 * set then an exception called NoSuchElementException is thrown.
	 *
	 * @param element a String
	 * @throws NoSuchElementException if the String 'element' is not a member of the
	 *                                set
	 */
	public void deleteElement(String element) throws NoSuchElementException {
		setv.remove(element);
	}

	private void addAllElements(SetOfStrings set1) {
		Enumeration<String> enum1 = set1.elements();
		while (enum1.hasMoreElements()) {
			insertElement((String) enum1.nextElement());
		}
	}

	/**
	 * determines the union of the current set with 'set2' and returns the new set
	 * which is the union of these two sets. This operation SHOULDN'T MODIFY EITHER
	 * OF THE INPUT SETS.
	 *
	 * @param set2 a SetOfStrings
	 */
	public SetOfStrings union(SetOfStrings set2) {
		SetOfStrings out = new SetOfStrings();
		
		return out;
	}

	/**
	 * determines the intersection of the current set with 'set2' and returns the
	 * new set which is the intersection of these two sets. This operation SHOULDN'T
	 * MODIFY EITHER OF THE INPUT SETS.
	 *
	 * @param set2 a SetOfStrings
	 */
	public SetOfStrings intersection(SetOfStrings set2) {
		SetOfStrings out = new SetOfStrings();
		return out;
	}

	/**
	 * determines the difference of the current set with 'set2' and returns the new
	 * set which contains all the elements that are in the current set but not in
	 * "set2" This operation SHOULDN'T MODIFY EITHER OF THE INPUT SETS.
	 *
	 * @param set2 a SetOfStrings
	 */
	public SetOfStrings difference(SetOfStrings set2) {
		SetOfStrings out = new SetOfStrings();
		return out;
	}

	/**
	 * determines the product of the current set with set2 and returns a new
	 * SetOfStrings representing the product. In the product, the pairs are denoted
	 * by a new string "a,b" where "a" is a member of the first set and "b" is a
	 * member of the second set.
	 *
	 * @param set2 a SetOfStrings
	 **/

	public SetOfStrings product(SetOfStrings set2) {

		SetOfStrings out = new SetOfStrings();

		// set2.displaySet()
		return out;
	}

	/**
	 * determines if set2 is a subset of the current set returns true when every
	 * member of set2 to is present in the current set
	 *
	 * @param set2 a SetOfStrings
	 **/
	public boolean subset(SetOfStrings set2) {
		
		return true;
	}

	/**
	 * Displays the contents of the SetOfStrings
	 */
	public void displaySet() {
		Enumeration<String> e = elements();
		while (e.hasMoreElements()) {
			System.out.println("next element: " + e.nextElement());
		}
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SetOfStrings)) {
			return false;
		}
		SetOfStrings set = (SetOfStrings) other;
		return setv.equals(set.setv);
	}

}
