package helpers;

public class Protein {
	
	private ProteinEnum[] proteinTab= {ProteinEnum.beta, ProteinEnum.alpha1,ProteinEnum.alpha2,
			ProteinEnum.Ggamma,ProteinEnum.Agamma,ProteinEnum.delta};
	
	private ProteinEnum protein;
	
	public Protein(){
	}

	// used when the name is given
	public Protein(String name){
		for(ProteinEnum protein: proteinTab){
			if(name.equals(protein.getNameHbVar())){
				this.protein=protein;
				break;
			}
		}
	}

	 public String getNameHbVar(){
		 return this.protein.getNameHbVar();
	 }
	 public String getName(){ 
		 return this.protein.getName();
	 }
	 public String getIdSwissProt(){
		 return this.protein.getIdSwissProt();
	 }
	 public int getLength(){
		 return this.protein.getLength();
	 }
	 public String getSequence(){
		 return this.protein.getSequence();
	 }
	 
	 
	 /* Function that calculates the monoisotopic mass of the protein*/
	 public double getMonoisoMass(){
		 AminoAcid acidAmin;
		 String sequence= this.getSequence();
		 double mass=0;
		 
		 int i;
		 for(i=0;i<sequence.length();i++){
			 acidAmin=new AminoAcid(sequence.charAt(i));
			 mass += acidAmin.getMonoisoMass();
		 }
		 return mass;
	 }
	 
	 /* Function that calculates the average mass of the protein*/
	 public double getAverageMass(){
		 AminoAcid acidAmin;
		 String sequence= this.getSequence();
		 double mass=0;
		 
		 int i;
		 for(i=0;i<sequence.length();i++){
			 acidAmin=new AminoAcid(sequence.charAt(i));
			 mass += acidAmin.getAverageMass();
		 }
		 return mass;
	 }
}
