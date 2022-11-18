      package Java_Topics;

public class MethodOverLoading {

		
		     public  void display(float a)
		    {
		         System.out.println( "rijin " +a);
		    }
		   public  static void display(char a, int num)  
		    {
		        int c=10,  b=30;
		        num=c+b;
		         System.out.println(a+" "+num);
		    }
		    public void display(String c)
		    {
		      System.out.println(c);
		    }
		    public void display(int v)
		    {
		        
		         System.out.println(v);
		    }
		    public void display(char v)
		    {
		          System.out.println(v);
		    }
		      
		
public static class overload {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	MethodOverLoading w = new MethodOverLoading();
        
         w.display(60);
         w.display("rate");
                 w.display(88);
         w.display('r');
         MethodOverLoading.display('z',10);      
    }

}
}

		     


	


