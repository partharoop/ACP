package nz.ac.auckland.softeng281;

import java.util.Enumeration;

/**
 * A class for binary relations over a set of strings The relation needs a set
 * The relation is also a set
 *
 * @author Partha Roop
 */
public class StringRelation extends SetOfStrings {

	// This is the set used to construct the relation
	private SetOfStrings setMembers;

	/**
	 * create an empty StringRelation when no arguments are given -- constructor In
	 * this event the setMembers is a new SetOfStrings with no members yet
	 */
	public StringRelation() {
		setMembers = new SetOfStrings();
	}

	/**
	 * create an empty StringRelation when no arguments are given -- constructor In
	 * this event the setMembers is a new SetOfStrings with no members yet
	 */
	public StringRelation(SetOfStrings s) {
		setMembers = s;
		//relation = r;
	}

	public Enumeration<String> getRelationalElements() {
		return elements();
	}

	public Enumeration<String> getSetMemberElements() {
		return setMembers.elements();
	}

	/*public void setRelationalElements(SetOfStrings inp) {
		relation = inp;
	}*/

	public void setSetMemberElements(SetOfStrings inp) {
		setMembers = inp;
	}

	public boolean isValid() {
		
		if(setMembers.product(setMembers).subset(this)) {
			return true;
		}
		else { 
			return false;
		}
	}

	

	public boolean isReflexive() {
		if (!isValid()) {
			return false;
		}
		else {
			return true;
		}
	}

	public boolean isSymmetric() {
		if (!isValid()) {
			return false;
		}
		else {
			return true;
		}
	}

	public boolean isTransitive() {
		if (!isValid()) {
			return false;
		}
		else {
			return true;
		}
	}

	
	public boolean isEquivalence() {
		return true;
	}

	public SetOfStrings eqClass(String node) {
		SetOfStrings out = new SetOfStrings();
		
		return out;
	}

	
	/*
	 * public static void main(String args[]) throws IOException {
	 * 
	 * //create the nodes of the graph as a set SetOfStrings nodes = new
	 * SetOfStrings(); SetOfStrings nodes1 = new SetOfStrings();
	 * 
	 * nodes.insertElement("0"); nodes.insertElement("1"); nodes.insertElement("2");
	 * nodes.insertElement("3");
	 * 
	 * 
	 * 
	 * //Crate a SetOfStrings to represent the relational elements as a set
	 * SetOfStrings adjNodes = new SetOfStrings(); adjNodes.insertElement("0,0");
	 * adjNodes.insertElement("1,1"); adjNodes.insertElement("2,2");
	 * adjNodes.insertElement("1,3"); adjNodes.insertElement("3,3");
	 * adjNodes.insertElement("3,1"); adjNodes.insertElement("0,1");
	 * adjNodes.insertElement("1,2"); adjNodes.insertElement("2,3");
	 * adjNodes.insertElement("0,2"); adjNodes.insertElement("1,2");
	 * adjNodes.insertElement("2,3"); adjNodes.insertElement("1,3");
	 * adjNodes.insertElement("2,0"); adjNodes.insertElement("3,0");
	 * adjNodes.insertElement("2,3"); adjNodes.insertElement("1,0"); StringRelation
	 * r = new StringRelation(); r.setRelationalElements(adjNodes);
	 * r.setSetMemberElements(nodes); //boolean status = r.isValid();
	 * //System.out.println("The status of the relation: "+status);
	 * 
	 * boolean statusRef = r.isReflexive();
	 * System.out.println("The status of the relation being reflexive is : "
	 * +statusRef);
	 * 
	 * boolean statusSym = r.isSymmetric();
	 * System.out.println("The status of the relation being symmetric is : "
	 * +statusSym);
	 * 
	 * boolean statusTr = r.isTransitive();
	 * System.out.println("The status of the relation being transitive is : "
	 * +statusTr);
	 * 
	 * SetUI s = new SetUI(); String command = s.getCommand();
	 * System.out.println("The command entered is "+command);
	 * 
	 * s.makeTokensGraph();
	 * 
	 * String out [] = r.makeTokens("aa,bb,cccc,d"); String reflexive =
	 * r.createReflexiveElement("25");
	 * 
	 * 
	 * String outcome= r.computeDual("100,1000");
	 * System.out.println("The dual value is: "+outcome); boolean outcome1=
	 * r.isFirstComponent("100","00,1000");
	 * System.out.println("Out come of first component test: "+outcome1); }
	 */
}