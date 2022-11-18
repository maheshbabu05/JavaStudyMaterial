package Java_Topics;

public class finally_Studyies {
	
	// Its an block of code to handle the exception
	public static void main(String args[]){  
		
		
		
	      try {    
	        System.out.println("Try section initialized"); 
	        
	        
	      // below code throws divide by zero exception  
	       int inputvalue =99/0;    
	       System.out.println(inputvalue);    
	      }   
	      
	      
	      catch (ArithmeticException e){  
	        System.out.println("Exception occur for the given data");  
	        System.out.println(e);  
	      }   
	      
	      
	      finally {  
	        System.out.println("finally code block executed here");  
	      }    
	      System.out.println("Op is");    
	      }
	
	
	
	    }    

	

