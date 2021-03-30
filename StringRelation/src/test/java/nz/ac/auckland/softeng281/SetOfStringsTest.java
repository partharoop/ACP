
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
	
}
