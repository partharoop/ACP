package nz.ac.auckland.softeng281;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
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
	//StringRelation r;
	@Before
	public void setUp() {
		nodes = new SetOfStrings();
		edges = new StringRelation();
		edges.setSetMemberElements(nodes);
		//r = new StringRelation();
	}

	@After
	public void tearDown() {

	}
	
	@Test
	public void testIsValidTrue() {
		nodes.insertElement("0");
		nodes.insertElement("1");
		nodes.insertElement("2");
		edges.insertElement("0,0");
		edges.insertElement("1,1");
		//r = new StringRelation(nodes, edges);
		assertTrue(edges.isValid());
	}

	@Test
	public void testIsValidFalse() {
		nodes.insertElement("0");
		nodes.insertElement("1");
		nodes.insertElement("2");
		edges.insertElement("0,0");
		edges.insertElement("3,1");
		//r = new StringRelation(nodes, edges);
		assertFalse(edges.isValid());
	}
	
	@Test
	public void testIsValidEqual() {
		nodes.insertElement("0");
		nodes.insertElement("1");
		nodes.insertElement("2");
		edges.insertElement("0,0");
		edges.insertElement("0,1");
		edges.insertElement("0,1");
		edges.insertElement("1,0");
		edges.insertElement("1,1");
		edges.insertElement("1,2");
		edges.insertElement("2,0");
		edges.insertElement("2,1");
		edges.insertElement("2,2");
		
		//r = new StringRelation(nodes, edges);
		assertTrue(edges.isValid());
	}
}