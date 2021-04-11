package parsingWeb;

//import user.*;
import java.io.*;
import java.net.*;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParsingWeb {
	
	// data : http request/query
	// adresse: adress file
	// result: HTML file recovered
	// keys: table of the "hidden" inputs (see HTML code of the Web page parsed)
	// values: valuer of the fields recovered
	
	private String adresse="http://globin.bx.psu.edu/cgi-bin/hbvar/query_vars3";
	private String data,result;
	private ArrayList<String> keys = new ArrayList<String>();
	private ArrayList<String> values = new ArrayList<String>();
	
	/* Function that tests state of Internet connexion*/
	public boolean testConnexion() throws IOException{
		boolean flag=false;
		try{
			
			URL url = new URL(this.adresse);
			URLConnection conn = url.openConnection();
			conn.connect();
			
			flag=true;
		
		}catch (Exception e) {
			System.err.println("Problem while connecting to url.");
			System.err.println(e);
			e.printStackTrace();
			System.exit(1);
			flag=false;
		}
		return flag;
	}
	
	/* Function that creates the name of the request 
	 * and connects to the server */
	private String post() throws IOException {
		this.result = "";
		OutputStreamWriter writer = null; // object that writes the request
		BufferedReader reader = null; // object that reads the result
		
		try {
			this.data = "";
			for (int i=0; i < this.keys.size(); i++) {
				if (i!= 0) {
					this.data += "&";
				}
				this.data += URLEncoder.encode(this.keys.get(i), "UTF8")+"="+URLEncoder.encode(this.values.get(i),
						"UTF8");
			}
			URL url = new URL(this.adresse);
			URLConnection conn = url.openConnection();
			// Execution of the request
			conn.setDoOutput(true);
			writer = new OutputStreamWriter(conn.getOutputStream());
			writer.write(data);
			writer.flush();
			// Read the result
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String ligne;
			while((ligne = reader.readLine())!= null) {
				this.result += ligne;
			}
			
		}
		catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
			System.exit(1);
		}
		finally {
			try{writer.close();}catch(Exception e){}
			try{reader.close();}catch(Exception e){}
		}
		return this.result;
	}
	
	
	/* Function that parse the Web page "http://globin.bx.psu.edu/cgi-bin/hbvar/counter"
	 * and extracts the values to create a query */
	private void parseCounterTable(){

		String url = "http://globin.bx.psu.edu/cgi-bin/hbvar/counter";
        try {
			Document doc = Jsoup.connect(url).get();
			
			this.keys.add("mode"); 
			this.keys.add("display_format");
                
		    Elements inputElements = doc.getElementsByTag("input");     
		    
		    int viewSummaryTable=0;
		    for (Element inputElement : inputElements) {    
		        String value = inputElement.attr("value");  
		        if(value.equals("View summary table")){
					viewSummaryTable++;
				}else {
					if(viewSummaryTable == 1){
						values.add(value);
						
						if(!(value.equals("View summary table")||value.equals("output")
								||value.equals("table"))){
							keys.add("i");
						}		
					}
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
			System.err.println(e);
			System.exit(1);
		}
	}

	/* Function that creates the request/query 
	 * and create a HTML file to parse
	 * output: path of the file that is going to be created */
	private void request(String output) throws IOException{	
		try {
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(output)));
		
			this.parseCounterTable();
			String result = this.post();
			pw.println(result);
			pw.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/* Function that parses a HTML file and extracts data
	 * input: path of the file that is going to be parsed 
	 * 		ex. C:\\Users\\myName\\Desktop\\HbVar query results.html"
	 * output: path of the file that is going to be created*
	 * 		ex. C:\\Users\\myName\\Desktop\\dataHbVar.txt */
	public void parseHTML(String input, File output) throws IOException{
		try {
			File inputfile = new File(input);
			Document document= Jsoup.parse(inputfile,"UTF-8");
		
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter(output))); 
			//PrintWriter pw=new PrintWriter(new BufferedWriter(output));
		
			Element body = document.body();
			Elements elmts = body.getElementsByTag("td");
			int i=0;
			for (Element elmt : elmts) {
				if(i<2){
					String s= elmt.text();
					if(i == 0){
						s= (elmt.text()).replace(' ', '$');
					}
					pw.print(s+"***"/*User.separator*/);
					i++;
				}else{
					pw.print(elmt.text()+" ");
					pw.println(" ");
					pw.println(" ");
					i=0;
				}
			} 
			pw.close();
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
			System.exit(1);
		}
	}
	
	
	/* Function that parses the Web page and extracts data 
	 * html: path of the HTML file that is going to be created
	 * file: final result with all the data extracted */
	public void parseWebPage(String html, File file) throws IOException{
		this.request(html);
		this.parseHTML(html, file);
	}

}//end class
