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


public class StringRelationTest {
	SetOfStrings nodes;
	StringRelation edges;

	@Before
	public void setUp() {
		nodes = new SetOfStrings();
		edges = new StringRelation();
	}

	@After
	public void tearDown() {

	}
	
	@Test
	public void testISValid() {
		
		
	}

}