package Java_Topics;

public class AbstarctChild extends AbstaractSS{
	
	// method is abstract and does not have implementation omn that particular method is known as an abstract method. 
	
	
	public void method1() {
		System.out.println("open lock");
		
	}
	
	public void method2() {
		System.out.println("Open door");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstarctChild obj2 = new AbstarctChild();
		obj2.method1();
		obj2.method2();

	}

	            
}
