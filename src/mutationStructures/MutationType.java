package mutationStructures;

import java.util.ArrayList;

import helpers.*;


public interface MutationType {
	
	/* returns proteins because we can have "protein or protein" in the header*/
	public Header getHeader();
	/* returns delta for monoisotopic mass*/
	public double getdeltaMonoiso() ;
	
	/* returns delta for average mass */
	public double getdeltaAverage() ;

	
	public void print();
	
}
