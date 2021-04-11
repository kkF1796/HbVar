package helpers;

public enum AminoAcidEnum {
	
	Ala("A","Ala","C3H5ON",71.03711,71.0788),
	Arg("R","Arg","C6H12ON4",156.10111,156.1875),
	Asn("N","Asn","C4HO2N2",114.04293,114.1038),
	Asp("D","Asp","C4H5O3N",115.02694,115.0886),
	Cys("C","Cys","C3H5ONS",103.00919,103.1388),
	Glu("E","Glu","C5H7O3N",129.04259,129.1155),
	Gln("Q","Gln","CC5H8O2N2",128.05858,128.1307),
	Gly("G","Gly","C2H3ON",57.02146,57.0519),
	His("H","His","C6H7ON3",137.05891,137.1411),
	Ile("I","Ile","C6H11ON",113.08406,113.1594),
	Leu("L","Leu","C6H11ON",113.08406,113.1594),
	Lys("K","Lys","C6H12ON2",128.09496,128.1741),
	Met("M","Met","C5H9ONS",131.04049,131.1926),
	Phe("F","Phe","C9H9ON",147.06841,147.1766),
	Pro("P","Pro","C5H7ON",97.05276,97.1167),
	Ser("S","Ser","C3H5O2N",87.03203,87.0782),
	Thr("T","Thr","C4H7O2N",101.04768,101.1051),
	Trp("W","Trp","C11H10ON2",186.07931,186.2132),
	Tyr("Y","Tyr","C9H9O2N",163.06333,163.176),
	Val("V","Val","C5H9ON",99.06841,99.1326);
	
	private String letterCode="";
	private String name="";
	private String formula="";
	private double monoisoMass;
	private double averageMass;
	
	//Constructor
	 AminoAcidEnum(String letterCode, String name, String formula, double monoisoMass,double averageMass){
		 this.letterCode=letterCode;
		 this.name=name;
		 this.formula=formula;
		 this.monoisoMass=monoisoMass;
		 this.averageMass=averageMass;
	}
	 
	 public String getLetterCode(){
		 return letterCode;
	 }
	 public String getName(){ 
		 return name;
	 }
	 public String getFormula(){
		 return formula;
	 }
	 public double getMonoisoMass(){
		 return monoisoMass;
	 }
	 public double getAverageMass(){
		 return averageMass;
	 }

}
