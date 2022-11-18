package Java_Topics;

public class Finaliz_Study {

	// here, the cleanup activity occurs before destroying the object 
	
	// Call by garbage collector before destroy the object from memory
		
		public static void main(String[] args)     
	    {     
			Finaliz_Study F1 = new Finaliz_Study();        
	        
			
			
	        System.out.println("Hashcode is: " + F1.hashCode());           
	        F1 = null;  
	        
	        
	      
	        System.gc();     
	        System.out.println("End of the garbage collection");     
	    }     
	
		
		
	    protected void finalize()     
	    {     
	        System.out.println("Called the finalize() method");     
	    }    

	}


