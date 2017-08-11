import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ParseXMLEfficient {
	
	public static void parse(String tagname, String xml) {
		
		String content = "";
 		
		int startindex = xml.indexOf("<"+tagname+">");
		startindex += tagname.length()+2;
		int endindex = xml.indexOf("</" + tagname + ">");
 		if(startindex>0 && endindex >0 && startindex < endindex)
			content = xml.substring(startindex, endindex);
		if(content.isEmpty())
			System.out.println("No such tag found.");
		System.out.println(content);
 	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String xml = "<xml>"
				+ "<name>Sargam</name>"
				+ "<pwd>***</pwd>"
				+ "</xml>";
		
		BufferedReader br = new BufferedReader(new FileReader("..\\pom.xml"));
		String lines;
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			  lines = sb.toString();
			
		}
		finally {
			br.close();
		}
		System.out.println(lines);
		parse("name",xml);	
		parse("pwd",xml);
		
		parse("groupID",lines);
		parse("version",lines);
	}
}
