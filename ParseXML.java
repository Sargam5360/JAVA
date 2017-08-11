
public class ParseXML {
	
	public static void par(String xml) {
		
		String name = "";
		String pwd="";
		
		for(int i=0 ; i < xml.length() ; i++)
		{
			if(xml.charAt(i) == '<' && xml.charAt(i+1) == 'n' && xml.charAt(i+2) == 'a')
			{
				int c= i + 6;		
				while(xml.charAt(c) != '<')
				{
					name += xml.charAt(c);
					c++;
				}		
			}
			
			if(xml.charAt(i) == '<' && xml.charAt(i+1)=='p' && xml.charAt(i+2)=='w') {
				int d = i+5;
				while(xml.charAt(d) != '<')
				{
					pwd += xml.charAt(d);
					d++;					
				}
			}
		
		}
		System.out.println(name);
		System.out.println(pwd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xml = "<xml>"
				+ "<name>Sargam</name>"
				+ "<pwd>***</pwd>"
				+ "</xml>";
		par(xml);		
	}
}
