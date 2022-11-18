package Java_Topics;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comment=("this is true");
        
        String result="Truth triumph";
        String result1="Truth trimph";
        
        
        System.out.println("clup up "+comment.concat(result));
        System.out.println(result.equals(result1));
        System.out.println(comment.length());
        System.out.println(comment.charAt(3));
        System.out.println(comment.indexOf("true")); 
        
        // To reverse the declared String
        String revresult = new StringBuffer(result).reverse().toString();
        System.out.println(revresult);
        
      

	}

}
