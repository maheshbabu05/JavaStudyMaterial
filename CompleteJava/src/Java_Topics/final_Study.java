package Java_Topics;

public class final_Study {
	
	// final variable can't be reassign and method can't be override
	
	 final int age = 20; 
	 
	 String name ="mahesh";
	    public void displayvalues() { 
	    	
	    //  age= 33;
	      name= "Babu";
	    
	    }  
	      
	    public static void main(String[] args) {  
	      
	    	final_Study obj = new final_Study();  
	    System.out.println("value is" + obj );
	    	
	    obj.displayvalues();  
	    }  

}
