package user;

import java.util.*;
import helpers.*;

import mutationStructures.Mutation;

public class Mode {
	
	/* TYPES OF USER'S QUERY*/
	
	/* Syntax of a query, given on command line while lauching the program
	 * 
	 *     hbvarxtract -mz 950 -charge 18 -tol 1 [-chain beta] [-mass mono/avg] -l/r  /user/path/file.html [-v]
	 *     
	 *     with -chain, -mass and -v given like options */
	
	private int mode;
	private double mz;
	private double charge; 
	private double tol; 
	private String chain;
	private String massOpt;
	private double mass;
	
	private boolean vExists=false;
	
	private boolean local;
	private String file="";
	
	public Mode(){ 
		this.mode=0;
		this.chain="";
		this.massOpt="mono";
		this.local =true;
	}
	
	public Mode(double mz,double charge,double tol){
		this.mode=0;
		this.chain="";
		this.massOpt="mono";
		this.local =true;
		this.mz=mz;
		this.charge=charge;
		this.tol=tol;
	}
	
	// creates mode according to arguments containing in args[] (command line)
	public Mode(String[] args){
		this.mode=0;
		this.chain="";
		this.massOpt="mono";
		this.local=true;
		
		int i=0;
		boolean chainFlag=false;
		boolean massFlag=false;
		
		while(i<args.length){	
			
			if(args[i].equals("-mz")){
				mz=Double.parseDouble(args[i+1]);
				i+=2;
				
			}
			
			else if(args[i].equals("-charge")){
				charge=Double.parseDouble(args[i+1]);
				i+=2;
		
			}
			
			else if(args[i].equals("-tol")){
				tol=Double.parseDouble(args[i+1]);
				i+=2;
	
			}
			
			else if(args[i].equals("-chain")){
				chain=args[i+1];
				chainFlag=true;
				i+=2;

			}
			
			else if(args[i].equals("-mass")){
				massOpt=args[i+1];
				massFlag=true;
				i+=2;

			}
			
			else if(args[i].equals("-v")){
				vExists = true;
				i++;
			}
			
			else if(args[i].equals("-l")){
				file=args[i+1];
				i+=2;
			}
			
			else if(args[i].equals("-r")){
				file=args[i+1];
				this.local=false;
				i+=2;
			}
			
			
		}
		
		this.setMode(args.length,chainFlag,massFlag);
		this.setMass();
	}
	
	/* Functions that sets the mode according to user's choice 
	 * input: 
	 * 		- length : number of arguments given in command line
	 * 		- chainFlag : boolean relative to the option -chain
	 * 		- massFlag : boolean relative to the option -mass
	 * */
	public void setMode(int length,boolean chainFlag, boolean massFlag){
		// input: hbvarextract -mz 950 -charge 18 -tol 1 -l/r /path/file.html [-v]
		if(length == 8 || length == 9){
			mode=1;
		}
				
		// input: hbvarextract -mz 950 -charge 18 -tol 1 -chain beta -l/r /path/file.html [-v]
		if((length == 10 || length == 11) && chainFlag){ 
			mode=2;
		}
				
		// input: hbvarextract -mz 950 -charge 18 -tol 1 -mass avg -l/r /path/file.html [-v]
		if((length == 10 || length == 11) && massFlag){
			if(massOpt.equals("avg")){
				mode=3;
			}else if(massOpt.equals("mono")){
				mode=1;
			}
		}
				
		// input: hbvarextract -mz 950 -charge 18 -tol 1 -chain beta -mass avg -l/r /path/file.html [-v]
		if(length == 12 || length == 13){
			if(massOpt.equals("avg")){
				mode=4;
			}else if(massOpt.equals("mono")){ 
				mode=2;
			}
		}				
	}
	
	
	public void setMass(){
		this.mass= mz*charge-charge;
	}
	
	public int getMode(){
		return mode;
	}
	
	public double getMz(){
		return mz;
	}
	
	public double getCharge(){
		return charge;
	}
	
	public double getTol(){
		return tol;
	}
	
	public String getChain(){
		return chain;
	}
	
	public String getMassOpt(){
		return massOpt;
	}
	
	public double getMass(){
		return mass;
	}
	
	public Boolean getVExists(){
		return vExists;
	}
	
	public Boolean getlocal(){
		return local;
	}
	
	public String getFile(){
		return file;
	}
	
	/* Function thats responds to a query of type:
	 * 		hbvarextract -mz 950 -charge 18 -tol 1  
	 * */
	public void  mode1(ArrayList<Mutation> mutations){
		int j = 1;
		for(Mutation mutation: mutations){
			
			//data recovery
			double massMonoiso = mutation.getMassMonoiso();

			//display data if mass condition satisfied
			if(Math.abs(massMonoiso-mass) <= tol){
				
					System.out.print(j+",");
					mutation.print();
					System.out.print(",");
					System.out.println(massMonoiso);
					j++;
					
			}
			
			
		}
	}
	
	/* Function thats responds to a query of type:
	 * 			hbvarextract -mz 950 -charge 18 -tol 1 -chain beta
	 * */
	public void  mode2(ArrayList<Mutation> mutations){		
		int j = 1;
		for(Mutation mutation: mutations){
			
			//data recovery
			double massMonoiso = mutation.getMassMonoiso();
			Protein protein = mutation.getProtein();
			
			//display the mass corresponding if mutation contains wanted protein
			if(protein.getNameHbVar().equals(chain)) {
					
				//display data if mass condition satisfied
				if(Math.abs(massMonoiso-mass) <= tol){
						
						System.out.print(j+",");
						mutation.print();
						System.out.print(",");
						System.out.println(massMonoiso);
						j++;
						
				}
					
			}
				
			
			
		}
	}
	
	/* Function thats responds to a query of type:
	 * 		hbvarextract -mz 950 -charge 18 -tol 1  -mass avg
	 * */
	public void  mode3(ArrayList<Mutation> mutations){
		int j = 1;
		for(Mutation mutation: mutations){
			
			//data recovery
			double massAverage = mutation.getMassAverage();
			Protein protein = mutation.getProtein();
	
				
			//display data if mass condition satisfied
			if(Math.abs(massAverage-mass) <= tol){
				
				System.out.print(j+",");
				mutation.print();
				System.out.print(",");
				System.out.println(massAverage);
				j++;
					
	
			}
			
		}
	}
	
	/* Function thats responds to a query of type:
	 * 		hbvarextract -mz 950 -charge 18 -tol 1 -chain beta -mass avg
	 * */
	public void  mode4(ArrayList<Mutation> mutations){
		int j = 1;
		for(Mutation mutation: mutations){
			
			//data recovery
			double massAverage = mutation.getMassAverage();
			Protein protein = mutation.getProtein();
			

			//display the mass corresponding if mutation contains wanted protein 
			if(protein.getNameHbVar().equals(chain)) {
				
				//display data if mass condition satisfied
				if(Math.abs(massAverage-mass) <= tol){
							
					System.out.print(j+",");
					mutation.print();
					System.out.print(",");
					System.out.println(massAverage);
					j++;
							
				}
			
			}
			
		}
	}
	

}
