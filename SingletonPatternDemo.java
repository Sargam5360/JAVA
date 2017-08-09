
public class SingletonPatternDemo {
	public static void main(String args[]){
		
		//illegal constructor
		//Compile time error: The constructor SingleObject() is not visible
		//SingleObject obj = new SingleObject();
		
		//Get the only object available
		SingleObject obj = SingleObject.getInstance();
		
		//show the message
		obj.showMessage();
		
	}

}
