package helpers;


public class AminoAcid {
	
	private AminoAcidEnum[] acidAminTab= {AminoAcidEnum.Ala,AminoAcidEnum.Arg,AminoAcidEnum.Asn,
			AminoAcidEnum.Asp,AminoAcidEnum.Cys,AminoAcidEnum.Glu,AminoAcidEnum.Gln,AminoAcidEnum.Gly,
			AminoAcidEnum.His,AminoAcidEnum.Ile,AminoAcidEnum.Leu,AminoAcidEnum.Lys,AminoAcidEnum.Met,
			AminoAcidEnum.Phe,AminoAcidEnum.Pro,AminoAcidEnum.Ser,AminoAcidEnum.Thr,
			AminoAcidEnum.Trp,AminoAcidEnum.Tyr,AminoAcidEnum.Val};
	
	private AminoAcidEnum acidAmin;
	
	public AminoAcid(){
	}
	
	// used when the name is given
	public AminoAcid(String name){
		for(AminoAcidEnum acidAmin: acidAminTab){
			if(name.equals(acidAmin.getName())){
				this.acidAmin=acidAmin;
				break;
			}
		}
	}
	
	// used when the letter code is given
	public AminoAcid(char letter){
		String letterCode=Character.toString(letter);
		for(AminoAcidEnum acidAmin: acidAminTab){
			if(letterCode.equals(acidAmin.getLetterCode())){
				this.acidAmin=acidAmin;
				break;
			}
		}
	}
	
	 public String getLetterCode(){
		 return this.acidAmin.getLetterCode();
	 }
	 public String getName(){ 
		 return this.acidAmin.getName();
	 }
	 public String getFormula(){
		 return this.acidAmin.getFormula();
	 }
	 public double getMonoisoMass(){
		 return this.acidAmin.getMonoisoMass();
	 }
	 public double getAverageMass(){
		 return this.acidAmin.getAverageMass();
	 }
}
