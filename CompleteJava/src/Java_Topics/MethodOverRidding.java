package Java_Topics;

 class MethodOverRidding {
		 public void disp()
         {
          System.out.println("disp() method of parent1 class");
         }    
         public void disp1()
         {
          System.out.println("disp() method of parent2 class");
         }
        	 
        	 
         }
      @override
      
      class methodclassA extends MethodOverRidding{
         //Overriding method
         public void disp(){
          System.out.println("disp() method of Child1 class");
         }
         public void disp1()
         {
          System.out.println("disp() method of Child2 class");
         }    
         public void newMethod(){
          System.out.println("new method of main class");
         }
        
         public static void main(String[] args) {

        	 /* When Parent class reference refers to the parent class object
              * then in this case overridden method (the method of parent class)
              *  is called.*/
              
        	 MethodOverRidding x = new MethodOverRidding();
             x.disp();
             x.disp1();
             /* When parent class reference refers to the child class object
              * then the overriding method (method of child class) is called.
              * This is called dynamic method dispatch and runtime polymorphism
              */
             MethodOverRidding y = new methodclassA();
             y.disp();
             y.disp1();
                             
             methodclassA z = new methodclassA();
             z.newMethod();
         }     
	}


