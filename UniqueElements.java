
import java.util.HashSet;
import java.util.Iterator;
 
public class UniqueElements {
	Set s = new HashSet();
	
	public void add(int n)
	{
		s.add(n);
	}
	
	public void print()
	{
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	UniqueElements un = new UniqueElements();
	
	un.add(3);
	un.add(5);
	un.add(9);
	un.add(3);
	un.add(5);
	
	un.print();
	}

}
