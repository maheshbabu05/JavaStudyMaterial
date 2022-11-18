package Java_Topics;

public class inheritance_Stud {
	
	
	public class inc extends tech{
		
		
		
	}
	       public void main(String args[]){
	    	   
	    	   
	       inc v = new inc();
	    v.add();
	    v.sub();
	  //  v.multi(); 
	    }
	   private void multi() {
	       System.out.println("this is private method of main");
	      }}

	class tech {
	       String Subject1 = "Physics";
	       String Subject2 = "Chemistry";
	       String IIT = "Enterance Score";
	       int totalmark=1089;
	       void add(){
	           int Phy=187, che=194;
	           int total;
	           total = Phy + che;
	        System.out.println("Marks");
	        System.out.println("Total Marks of Physics and Chemistry = " +total);
	       }
	       
	       
	      void sub() {
	           int a=1, b=2;
	           int c=b-a;
	         
	           System.out.println("sub value="+c);
	       }



}
