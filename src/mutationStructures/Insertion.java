package mutationStructures;

import java.util.ArrayList;

import helpers.*;



public class Insertion implements MutationType{
	/*/****************************************** attributes ***********************************************/
	private Header header;
	private AminoAcidSeq seqAmino;
	
	/*/****************************************** constructors *********************************************/
	public Insertion(Header header, AminoAcidSeq seqAmino) {
		
		this.header = header;
		
		this.seqAmino= seqAmino;		
	}
		
	public Insertion() {}
	
		

	/*/****************************************** get delta *********************************************/
	/*/* getdelta : finds the difference between the mutation and the chain without mutation**/
	
	/* returns delta for monoiso mass*/
	public double getdeltaMonoiso() {
		return seqAmino.getMonoisoMass();
	}
	
	/* returns delta for average mass */
	public double getdeltaAverage() {
		return seqAmino.getAverageMass();
	}

	/*/****************************************** print ************************************************/
	public void print() {
		//display the data 
		
		//display of interval
		System.out.print("between ");
		this.header.print();
		
		System.out.print("inserted ");
		
		seqAmino.print();
	
	}
	
	/*/**************************************** getters ************************************************/
	public Header getHeader() {
		return header;
	}

	public AminoAcidSeq getSeqAmino() {
		return seqAmino;
	}
	


}
