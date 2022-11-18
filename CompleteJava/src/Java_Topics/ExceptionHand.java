package Java_Topics;

public class ExceptionHand {
	

	// Here, Exception handle via finally block using Try and Catch
		
		public class arthmeticexp {

            public void main(String[] args) 
           { 
               int a = 10, b = 5, c = 5, result; 
               try { 
                   result = a / (b - c); 
                   System.out.println("result" + result); 
               } 
                     
         
               catch (ArithmeticException e) { 
                   System.out.println("Exception caught:Division by zero"); 
               } 
                               
              finally { 
                   System.out.println("final block"); 
               } 
              System.out.println("no exe"); 
               result = a / (b - c); 
               System.out.println("result" + result); 

           } 
            
   }



	}


