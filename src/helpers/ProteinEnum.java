package helpers;


public enum ProteinEnum {
	
	beta("beta","Hemoglobin A beta chain","P68871",146,"VHLTPEEKSAVTALWGKVNVDEVGGEALGRLLVVYPWTQRFFESFGDLSTPDAVMGNPKVKAHGKKVLGAFSDGLAHLDNLKGTFATLSELHCDKLHVDPENFRLLGNVLVCVLAHHFGKEFTPPVQAAYQKVVAGVANALAHKYH"),
	alpha1("alpha1","Hemoglobin alpha chain","P69905",141,"VLSPADKTNVKAAWGKVGAHAGEYGAEALERMFLSFPTTKTYFPHFDLSHGSAQVKGHGKKVADALTNAVAHVDDMPNALSALSDLHAHKLRVDPVNFKLLSHCLLVTLAAHLPAEFTPAVHASLDKFLASVSTVLTSKYR"),
	alpha2("alpha2","Hemoglobin alpha chain","P69905",141,"VLSPADKTNVKAAWGKVGAHAGEYGAEALERMFLSFPTTKTYFPHFDLSHGSAQVKGHGKKVADALTNAVAHVDDMPNALSALSDLHAHKLRVDPVNFKLLSHCLLVTLAAHLPAEFTPAVHASLDKFLASVSTVLTSKYR"),
	Ggamma("Ggamma","Hemoglobin G gamma","P69892",146,"GHFTEEDKATITSLWGKVNVEDAGGETLGRLLVVYPWTQRFFDSFGNLSSASAIMGNPKVKAHGKKVLTSLGDAIKHLDDLKGTFAQLSELHCDKLHVDPENFKLLGNVLVTVLAIHFGKEFTPEVQASWQKMVTGVASALSSRYH"),
	Agamma("Agamma","Hemoglobin A gamma","P69891",146,"GHFTEEDKATITSLWGKVNVEDAGGETLGRLLVVYPWTQRFFDSFGNLSSASAIMGNPKVKAHGKKVLTSLGDAIKHLDDLKGTFAQLSELHCDKLHVDPENFKLLGNVLVTVLAIHFGKEFTPEVQASWQKMVTAVASALSSRYH"),
	delta("delta","Hemoglobin delta","P02042",146,"VHLTPEEKTAVNALWGKVNVDAVGGEALGRLLVVYPWTQRFFESFGDLSSPDAVMGNPKVKAHGKKVLGAFSDGLAHLDNLKGTFSQLSELHCDKLHVDPENFRLLGNVLVCVLARNFGKEFTPQMQAAYQKVVAGVANALAHKYH");
	
	private String nameHbVar="";
	private String name="";
	private String idSwissProt="";
	private int length;
	private String sequence;
	
	//Constructor
	 ProteinEnum(String nameHbVar, String name, String idSwissProt, int length,String sequence){
		 this.nameHbVar=nameHbVar;
		 this.name=name;
		 this.idSwissProt=idSwissProt;
		 this.length=length;
		 this.sequence=sequence;
	}
	 
	 public String getNameHbVar(){
		 return nameHbVar;
	 }
	 public String getName(){ 
		 return name;
	 }
	 public String getIdSwissProt(){
		 return idSwissProt;
	 }
	 public int getLength(){
		 return length;
	 }
	 public String getSequence(){
		 return sequence;
	 }
	 
	 //public double calcMonoisoMass(){}
	 
	 //public double calcAverageMass(){}

}
