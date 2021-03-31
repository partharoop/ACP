
package nz.ac.auckland.softeng281;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import java.util.NoSuchElementException;


public class SetOfStringsTest {
	SetOfStrings set1, set2;

	@Before
	public void setUp() {
		set1 = new SetOfStrings();
		set2 = new SetOfStrings();
	}

	@After
	public void tearDown() {

	}

	@Test
	public void testInsert() {

		set1.insertElement("a");
		set1.insertElement("b");
		set1.insertElement("a");
		SetOfStrings expected = new SetOfStrings();
		expected.insertElement("a");
		expected.insertElement("b");
		assertEquals(expected, set1);
	}
	
	@Test
	public void testInsert1() {
		set1.insertElement("a");
		set1.insertElement("b");
		set1.insertElement("a");
		assertEquals(set1.size(),2);
	}
	
	@Test
	public void testRemoveEmpty() {
		
		try {
			set1.displaySet();
			set1.deleteElement("a");
			fail();
		}
		catch(NoSuchElementException e) {
			
		}
	}
	
	@Test
	public void testRemove() {
		try {
			set1.insertElement("a");
			set1.insertElement("b");
			set1.insertElement("a");
			set1.deleteElement("a");
			set1.deleteElement("b");
			assertEquals(set1.size(),0);
		}
		catch(NoSuchElementException e) {
			fail();
		}
	}
	
	@Test public void testUnionWithEmpty() {
		set1.insertElement("a");
		set1.insertElement("b");
		set1=set1.union(set2);
		SetOfStrings expected = new SetOfStrings();
		expected.insertElement("a");
		expected.insertElement("b");
		assertEquals(expected, set1);
	}
	
	//subset test
	@Test public void testSubset1() {
		set1.insertElement("a");
		set1.insertElement("b");

		SetOfStrings expected = new SetOfStrings();
		expected.insertElement("a");
		expected.insertElement("b");
		assertEquals(true, set1.subset(expected));
	}
	
	//proper subset test
	@Test public void testSubset2() {
		set1.insertElement("a");
		set1.insertElement("b");
		set1.insertElement("c");
		SetOfStrings expected = new SetOfStrings();
		expected.insertElement("a");
		expected.insertElement("b");
		assertEquals(true, set1.subset(expected));
	}
	
	//Product of a set of size 3 with an empty set
	@Test public void testProductWithEmpty() {
		set1.insertElement("a");
		set1.insertElement("b");
		set1.insertElement("c");

		//SetOfStrings expected = new SetOfStrings();

		assertEquals(set1.product(set2).size(),0);
	}
	
	//Product with a set2 of size 1
	@Test public void testProduct1() {
		set1.insertElement("a");
		set1.insertElement("b");
		set1.insertElement("c");
		set2.insertElement("a");
		SetOfStrings expected = new SetOfStrings();
		expected.insertElement("a,a");
		expected.insertElement("b,a");
		expected.insertElement("c,a");
		assertEquals(expected, set1.product(set2));
	}
	
		//Product with a set2 of size 3
		@Test public void testProduct2() {
			set1.insertElement("a");
			set1.insertElement("b");
			set1.insertElement("c");
			set2.insertElement("a");
			set2.insertElement("d");
			SetOfStrings expected = new SetOfStrings();
			expected.insertElement("a,a");
			expected.insertElement("b,a");
			expected.insertElement("c,a");
			expected.insertElement("a,d");
			expected.insertElement("b,d");
			expected.insertElement("c,d");
			System.out.println("Display the product set");
			set1.product(set2).displaySet();
			assertEquals(set1.product(set2).size(),6);
			assertEquals(expected, set1.product(set2));
			
		}
	
}
