package mutationStructures;

import java.util.ArrayList;

import helpers.*;


public class Replacement implements MutationType{

	/*/****************************************** attributes ***********************************************/
	private Header header;
	private AminoAcidSeq seqOld;
	private AminoAcidSeq seqNew;
	
	/*/*************************************** constructors *******************************************/
	public Replacement(Header header, AminoAcidSeq seqOld, AminoAcidSeq seqNew) {
		this.header = header;
		this.seqOld = seqOld;
		this.seqNew = seqNew;	
	}
	
	public Replacement() {}

	/*/****************************************** get delta *********************************************/
	/*/* getdelta : find the difference between the mutation and the chain without mutation**/

	/* returns delta for monoiso mass*/
	public double getdeltaMonoiso() {
		return seqNew.getMonoisoMass()-seqOld.getMonoisoMass();
	}
	
	/* returns delta for average mass */
	public double getdeltaAverage() {
		return seqNew.getAverageMass()-seqOld.getAverageMass();
	}
	
	/*/******************************* print **************************************************/
	public void print() {
		//display the data 
		
		//display of interval
		//first index
		this.header.print();
		
		//the old sequence < new sequence
		seqOld.print();
		System.out.print(">");
		seqNew.print();
	}
		
	/*/********************************** getters ************************************************/

	public AminoAcidSeq getSeqOld() {
		return seqOld;
	}
	public AminoAcidSeq getSeqNew() {
		return seqNew;
	}
	
	public Header getHeader() {
		return header;
	}

	

}
