package Assingments;

public class Q_41 {

	public static void main(String argvs[])  
	{  
	// creating an object of the Thread class using the constructor Thread(String name)   
	Thread t= new Thread("W.A.J.P");  
	  
	// the start() method moves the thread to the active state  
	t.start();  
	// getting the thread name by invoking the getName() method  
	String str = t.getName();  
	System.out.println(str);  
	}  
	}  
	
	

