package helpers;

import java.util.ArrayList;

public class Header {
	
	/*/****************************************** attributes *********************************************/
	private int firstIndNum;
	private String firstIndTxt;
	private int lastIndNum;
	private String lastIndTxt;
	
	/*/****************************************** constructor *********************************************/
	public Header(int firstIndNum, String firstIndTxt, int lastIndNum, String lastIndTxt) {

		this.firstIndNum = firstIndNum;
		this.firstIndTxt = firstIndTxt;
		this.lastIndNum = lastIndNum;
		this.lastIndTxt = lastIndTxt;
	}
	
	/*/******************************************* print ************************************************/	
	public void print(){
		//first index
		System.out.print(firstIndNum);
		System.out.print("(");
		System.out.print(firstIndTxt);
		System.out.print(")");
		
		//if it's un interval
		if(lastIndNum != 0) {
			//hyphene between
			System.out.print("-");
					
			//last index
			System.out.print(lastIndNum);
			System.out.print("(");
			System.out.print(lastIndTxt);
			System.out.print(")");
		}
	}
	
	/*/******************************************* getters ************************************************/
	public int getFirstIndNum() {
		return firstIndNum;
	}
	public String getFirstIndTxt() {
		return firstIndTxt;
	}
	public int getLastIndNum() {
		return lastIndNum;
	}
	public String getLastIndTxt() {
		return lastIndTxt;
	}
	
}
