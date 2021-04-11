

package mutationStructures;
import java.util.*;

import helpers.Protein;

public class Entry{
	
	
	/*/****************************************** attributes ***********************************************/
	private String name;
	private ArrayList<Mutation> mutations;
	private String HGVSname; 
	
	/*/************************************ constructors ***************************************************/
	public Entry(String name, ArrayList<Mutation> mutations, String HGVSname) {
		this.name = name;
		this.mutations = mutations;
		this.HGVSname = HGVSname;
		
		/*name and hgvsname shall exist at mutation level as well*/
		for (Mutation mutation : mutations) {
			mutation.setName(name);
			mutation.setHGVSname(HGVSname);
	
		}
	}
	
	public Entry(String name) {
		this.name = name;
	
	}
	
	public Entry(String name, String HGVSname) {
		this.name = name;
		this.HGVSname = HGVSname;
		
	}

	
	public Entry() {}
	



	/*/****************************************** print ************************************************/
	
	public void print(){
		//name
		System.out.println(name);
		
		//every mutation
		for (Mutation mutation : mutations) {
			mutation.print();
			//System.out.println("OR");
			System.out.println("\n");
		}
		
		//hgvsName
		//System.out.println(HGVSname);
	} 
	
	/*/**************************************** getters ************************************************/
	public String getName() {
		return name;
	}
	public ArrayList<Mutation> getMutations() {
		return mutations;
	}
	public String getHGVSname() {
		return HGVSname;
	}
	
	
	

}
