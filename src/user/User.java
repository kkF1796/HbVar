package user;

import java.io.*;
import java.util.*;

import grammarHbVar.*;
import helpers.*;
import mutationStructures.*;
import parsingWeb.*;
import exceptions.*;



public class User {
	public static String separator= "***";

	public static void main(String[] args) throws ParseException, IOException {
		
		/*-------------------------------------------------------
		* Pass arguments to mode
		* -----------------------------------------------------*/
		
		if(args.length < 8){
			//System.err.println(e);
			System.err.println("Not enough arguments given on command line.");
			System.err.println(" ");
			System.err.println("hbvarxtract -mz 950 -charge 18 -tol 1 [-chain beta] [-mass mono/avg] -l/r  /user/path/file.html [-v]");
			System.err.println(" ");
			System.err.println("with -chain, -mass and -v optionnal. ");			
			System.err.println(" ");
			System.exit(1);
		}
		
		Mode mode= new Mode(args);
		
		/*System.out.println(mode.getMode()+" "+mode.getMz()+" "+mode.getCharge()+" "+mode.getTol()+" "+
		 mode.getChain()+" "+mode.getMassOpt()+" "+mode.getMass()+" "+mode.getlocal()+" "+mode.getFile());*/
		
		/* path of the file that contains parsing result (data of the website) */
		//String file=(mode.getFile()).replaceAll(".html", ".txt");
		
		File file = File.createTempFile("dataHbVar",".tmp");
		
		/* -------------------------
		 * Parsing of the Web Page
		 * -------------------------*/
		
		ParsingWeb pars=new ParsingWeb();
		File html = new File(mode.getFile());
		
		if(mode.getlocal()){
			pars.parseHTML(mode.getFile(),file);
		}else{
			if(html.exists() && !html.isDirectory()){
				System.err.println(" File already exists and can be overwritten. ");
				System.exit(1);
			}else{
				pars.testConnexion();
				pars.parseWebPage(mode.getFile(),file);
			}
		}
		
		
		/*---------------------------------------------------
		 *  Use of grammar to extract all mutation types 
		 * --------------------------------------------------*/
		BufferedReader br = new BufferedReader(new FileReader(file));
		
	 	GrammarHbVar parser = new GrammarHbVar(br);
	 	
	 	MutationList mutationList = new MutationList();
		
	 	mutationList = parser.grammarParsing();
		
		ArrayList<Mutation> mutations = mutationList.getListMutation();
		
		br.close();
		
		
		/*-----------------------------------------------------------
		*  Print the entry exceptions that are ignored in the grammar
		* -----------------------------------------------------------*/
		
		
		BufferedReader brException = new BufferedReader(new FileReader(file));
		
		ArrayList<Integer> lineIndex = mutationList.getLineIndex();
		
		ExceptionHandler handler = new ExceptionHandler();
		if (mode.getVExists()) {
			handler.handle(lineIndex, brException/*,v*/);
		}
			
		brException.close();
			
		/* ------------------------------------------
		 *  Select a mode according to user's choice
		 * ------------------------------------------*/
		
		switch(mode.getMode()){
			case 0:
				System.err.println("Entree non reconnue.");
				break;
			case 1:
				mode.mode1(mutations);
				break;
			case 2:
				mode.mode2(mutations);
				break;
			case 3:
				mode.mode3(mutations);
				break;
			case 4:
				mode.mode4(mutations); 
				break;
			default:
				System.err.println("Entree invalide.");
				break;
		}
		
		/* ------------------------------------------
		 *  Deletion of useless files
		 * ------------------------------------------*/
		/* HTML file is not deleted because it can be used 
		 * if there is no internet connexion */
		
		file.deleteOnExit(); 
	}

}
