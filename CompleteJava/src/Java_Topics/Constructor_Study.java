package Java_Topics;

public class Constructor_Study {


 // Method and class name should be same
	// constructor cannot be abstract, static, final, and synchronized
	

     int id;
     String name;
       //creating a parameterized constructor  
     Constructor_Study(int i,String n){ 
                  
        id = i;  
        name = n;
        System.out.println(id+" "+name);
        }  
        //method to display the values  
          void display(){
            System.out.println(id+" "+name);
            
            }  
       
        public  void main(String args[]){  
        //creating objects and passing values  
        	Constructor_Study s1 = new Constructor_Study(908,"Virat");  
        	Constructor_Study s2 = new Constructor_Study(639,"Anushka");  
        //calling method to display the values of object  
      s1.display();  
       s2.display();  
       }  
    


	}


