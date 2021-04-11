package helpers;
import java.util.*;
import mutationStructures.*;

//contains an array of mutations and an array of integers which are the numbers of the lines ignored in the grammar
public class MutationList {
	

	/*/****************************************** attributes *********************************************/
	ArrayList<Integer> lineIndex = new ArrayList<Integer>();
	ArrayList<Mutation> listMutation=new ArrayList<Mutation>();
	
	  public ArrayList<Integer> getLineIndex() {
		return lineIndex;
	}

	public ArrayList<Mutation> getListMutation() {
		return listMutation;
	}

	
	/*/****************************************** constructors *********************************************/
	  public MutationList(ArrayList<Integer> lineIndex, ArrayList<Mutation> listMutation) {
		  this.lineIndex = lineIndex;
		  this.listMutation = listMutation; 
	  }
	  
	  public MutationList() {
	 
	  }
	  
	  

}
