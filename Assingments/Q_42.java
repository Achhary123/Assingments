package Assingments;

public class Q_42 {

	public static class ExampleClass implements Runnable {  
		  
	    
	    public void run() {  
	        System.out.println("W.A.J.P");  
	    }  
	   
	    public static void main(String[] args) {  
	        ExampleClass ex = new ExampleClass();  
	        Thread t1= new Thread(ex);  
	        t1.start();  
	        System.out.println("Hi");  
	    }  
	}  
}
