package mutationStructures;

import java.util.ArrayList;
import helpers.*;


public class AddAcid implements MutationType{

	/*/****************************************** attributes *********************************************/
	private AminoAcid amino;
	private Header header;
	
	/*/****************************************** constructors *********************************************/
	public AddAcid(Header header, AminoAcid amino) {
		this.amino = amino;
		this.header = header;
	}
	
	public AddAcid() {}
	
	
	/*/******************************************* get delta ***********************************************/	
	/*/* getdelta : find the difference between the mutation and the chain without mutation**/
	
	/* returns delta for monoisotopic mass*/
	public double getdeltaMonoiso() {
		return amino.getMonoisoMass();
	}
	
	/* returns delta for average mass */
	public double getdeltaAverage() {
		return amino.getAverageMass();
	}
	
	/*/******************************************* print ************************************************/	
	public void print() {
		//display the data
		this.header.print();
		System.out.print(" Stop ");
		System.out.print(">");
		System.out.print(amino.getName());	
	}
	
	
	public AminoAcid getAmino() {
		return amino;
	}

	public Header getHeader() {
		return header;
	}
	
	
}
