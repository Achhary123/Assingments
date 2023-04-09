package Assingments;

	
	import java.util.HashSet;
	import java.util.List;
	import java.util.ArrayList;
	public class Q_32 {

	  public static void main(String[] args) {
	  
	     HashSet<String> hset = new HashSet<String>();
	 
	   
	     hset.add("Steve");
	     hset.add("Matt");
	     hset.add("Govinda");
	     hset.add("John");
	     hset.add("Tommy");
	 
	  
	     System.out.println("HashSet contains: "+ hset);
	 
	     
	     List<String> list = new ArrayList<String>(hset);
	 
	    
	     System.out.println("ArrayList contains: "+ list);
	  }
	}


