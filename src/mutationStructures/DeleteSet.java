package mutationStructures;

import java.util.ArrayList;

import helpers.*;



public class DeleteSet implements MutationType{
	


	/*/****************************************** attributes ***********************************************/
	private Header header;
	private AminoAcidSeq seqAmino;
	private Boolean inserted=false;
	private AminoAcid aminoInserted;

	/*/****************************************** constructors *********************************************/
	public DeleteSet(Header header, AminoAcidSeq seqAmino, Boolean inserted, AminoAcid aminoInserted) {
		this.header = header;
		this.seqAmino= seqAmino;
		this.inserted= inserted;
		this.aminoInserted= aminoInserted;

	}
	
	public DeleteSet(Header header, AminoAcidSeq seqAmino) {
		this.header = header;
		this.seqAmino= seqAmino;

	}
	public DeleteSet() {
		
	}

		
	/*/****************************************** get delta *********************************************/
	/*/* getdelta : finds the difference between the mutation and the chain without mutation**/
	
	/* returns delta for monoisotopique mass*/
	public double getdeltaMonoiso() {
		if(inserted){
			return aminoInserted.getMonoisoMass()-seqAmino.getMonoisoMass();
		}else{
			return -seqAmino.getMonoisoMass();
		}
	}
	
	/* returns delta for average mass */
	public double getdeltaAverage() {
		if(inserted){
			return aminoInserted.getAverageMass()-seqAmino.getAverageMass();
		}else{
			return -seqAmino.getAverageMass();
		}
	}
	
	/*/****************************************** print *********************************************/
	public void print() {
		//display the data
		
		//display of interval
		this.header.print();
		
		seqAmino.print();
		
		System.out.print("->0");
		if(inserted) {
			System.out.print(" and inserted ");
			System.out.print(aminoInserted.getName());
		}
	}
	
	/*/****************************************** getters *********************************************/
	
	public Header getHeader() {
		return header;
	}
	
	public AminoAcidSeq getSeqAmino() {
		return seqAmino;
	}
	
	public Boolean getInserted() {
		return inserted;
	}
	public AminoAcid getAminoInserted() {
		return aminoInserted;
	}
	
	
}
