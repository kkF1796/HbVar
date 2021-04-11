package helpers;
import java.util.*;

import mutationStructures.MutationType;

public class AminoAcidSeq {
	
	private ArrayList<AminoAcid> aminoAcidSeq;
	
	public AminoAcidSeq(){
	}
	
	public AminoAcidSeq(ArrayList<AminoAcid> aminoAcidSeq){
		this.aminoAcidSeq=aminoAcidSeq;
	}
	
	public ArrayList<AminoAcid> getAminoAcidSeq(){
		return aminoAcidSeq;
	}
	
	/* Function that adds an amino acid to the sequence */
	public void add(AminoAcid amino){ 
		this.aminoAcidSeq.add(amino);
	}
	
	/* Function that returns an amino acid, given the index (position in the sequence)*/
	public AminoAcid getAminoAcid(int index){
		int i=0;
		AminoAcid aminoAcid=new AminoAcid();
		for(AminoAcid acid: aminoAcidSeq){
			if(index == i){
				aminoAcid=acid;
				break;
			}
		}
		return aminoAcid;
	}
	
	/* Function that returns the monoisotopic mass of the sequence */
	 public double getMonoisoMass(){
		 double mass=0;
		 for(AminoAcid acid:aminoAcidSeq){
			 mass += acid.getMonoisoMass();
		 }
		 return mass;
	 }
	
	 /* Function that returns the average mass of the sequence */
	 public double getAverageMass(){
		 double mass=0;
		 for(AminoAcid acid:aminoAcidSeq){
			 mass += acid.getAverageMass();
		 }
		 return mass;
	 }
	 
	 public ArrayList<AminoAcid> getaminoAcidSeq(){
		 
		 return aminoAcidSeq;
	 }
	 
	 /* Function that prints the sequence */
	 public void print(){
		 System.out.print("{");
		 Iterator<AminoAcid> iterator = aminoAcidSeq.iterator();
		 System.out.print(iterator.next().getName());
			while(iterator.hasNext()) {
				System.out.print("-");
				System.out.print(iterator.next().getName());
				
			}
		System.out.print("}");
		 
		 
	 }
	 

}
