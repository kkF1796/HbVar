package mutationStructures;

import java.util.*;

import helpers.*;


public class AddChain implements MutationType{

	/*/****************************************** attributes ***********************************************/
	private Header header;
	private AminoAcidSeq seqAmino;
	
	/*/****************************************** constructors *********************************************/
	public AddChain(Header header, AminoAcidSeq seqAmino) {
			
		this.header = header;
		
		this.seqAmino= seqAmino;
			
	}
		
	public AddChain() {}
	
	
	/*/****************************************** get delta *********************************************/
	/*/* getdelta : find the difference between the mutation and the chain without mutation**/
	
	/* returns delta for monoisotopique mass*/
	public double getdeltaMonoiso() {
		return seqAmino.getMonoisoMass() + 44.997655;
	}
	
	/* returns delta for average mass */
	public double getdeltaAverage() {
		return seqAmino.getAverageMass() + 45.01774;
	}
	
	/*/****************************************** print *********************************************/
	public void print() {
		//display the data 
		
		//display of interval
		this.header.print();
		
		System.out.print("Stop");
		System.out.print(">");
		System.out.print(seqAmino.getaminoAcidSeq().get(0).getName());//print the first amino acid of this chain
		
		System.out.print(" ");
		
		seqAmino.print();

	}
	
	/*/****************************************** getters *********************************************/
	public Header getHeader() {
		return header;
	}

	public AminoAcidSeq getSeqAmino() {
		return seqAmino;
	}
	

	
}
