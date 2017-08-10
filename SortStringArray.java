
public class StringSort {
	
	public static String[] sort(String s[]) {
		
		for(int i=0 ; i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i].compareTo(s[j])>1)
				{
					String temp = s[i];
					s[i]=s[j];
					s[j] = temp;
				}
			}
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		
		String s[] = new String[5];
		s[0]="sargam";
		s[1]="abc";
		s[2]="xyx";
		s[3]="mkm";
		s[4]="ooo";
		
		s = sort(s);	
		
		for( int i = 0 ; i< s.length ; i++)
			System.out.println(s[i]);
	}

}
