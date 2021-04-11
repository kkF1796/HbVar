package mutationStructures;
import java.util.*;
import helpers.*;

public class Mutation {
	
	
	/*/*************************************** attributes *******************************************/
	
	//protein
	private Protein protein;
	
	//name
	private String name;
	
	//mutationTypes separated by AND
	private ArrayList<MutationType> listOfTypes;
	
	//hgvsname
	private String HGVSname; 
	
	//mass and delta
	private double massMonoiso;
	private double deltaMonoiso;
	private double massAverage;
	private double deltaAverage;
	
	/*/*************************************** constructors *******************************************/
	public Mutation(Protein protein, ArrayList<MutationType> types) {
		this.name = name;
		this.listOfTypes = types;
		this.HGVSname = HGVSname;
		//initialisation of protein
		this.protein = protein;
		
		/*masses are calculated*/
		this.calculateMassAverage();
		this.calculateMassMonoiso();
	}
	
	
	public Mutation(String name) {
		this.name = name;
	
	}
	
	public Mutation(String name, String HGVSname) {
		this.name = name;
		this.HGVSname = HGVSname;
		
	}
	
	public Mutation() {}
	
	
	
	/*/************************************* mass get *****************************************/
	
	public double getDeltaMonoiso() {
		return deltaMonoiso;
	}
	public double getDeltaAverage() {
		return deltaAverage;
		
	}
	public double getMassMonoiso() {
		return massMonoiso;
	}
	public double getMassAverage() {

		return massAverage;
	}

	/*/************************************* mass calculation *****************************************/
	

	/*add delta of every mutationType in listOfTypes*/
	public void calculateDeltaMonoiso() {

		 for (MutationType mutationType : listOfTypes) {
			 deltaMonoiso += mutationType.getdeltaAverage();
			
		 }

	}
	
	
	
	/*add delta of every mutationType in listOfTypes*/
	public void calculateDeltaAverage() {
		
		for (MutationType mutationType : listOfTypes) {
			deltaAverage += mutationType.getdeltaAverage();
		}
		
	}
	
	//iterate over proteins in order to calculate mass for every protein 
	//mass of mutation = mass of protein + delta of mutation
	public void calculateMassMonoiso() {
		calculateDeltaMonoiso();

		this.massMonoiso = deltaMonoiso + protein.getMonoisoMass();
	
		
	}
	
	//iterate over proteins in order to calculate mass for every protein
	//mass of mutation = mass of protein + delta of mutation
	public void calculateMassAverage() {
		calculateDeltaAverage();
		
		this.massAverage = deltaAverage + protein.getAverageMass();
			
		

	}
		
	
	/*/******************************* print **************************************************/
	public void print() {
		
		System.out.print(this.getName()+",");
		System.out.print(protein.getNameHbVar()+",");
		
		//iterate on listeOftypes and call print on each type

		Iterator<MutationType> iterator = listOfTypes.iterator();
		
		iterator.next().print();
		while(iterator.hasNext()) {
			System.out.print(" AND ");
			iterator.next().print();
			
		}
		
	


	}

	/*/********************************** getters ************************************************/
	public String getName() {
		return name;
	}
	public ArrayList<MutationType> getTypes() {
		return listOfTypes;
	}
	public String getHGVSname() {
		return HGVSname;
	}
	
	public Protein getProtein() {
		return protein;
	}
	
	/*/******************************* setters ************************************************/
	/*in order to set the name and hgvsname from the entry*/
	public void setName(String name) {
		this.name = name;
	}
	public void setHGVSname(String HGVSname) {
		this.HGVSname = HGVSname;
	}

}
