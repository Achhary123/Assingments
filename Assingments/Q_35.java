package Assingments;
import java.util.ArrayList;
public class Q_35 {
  public static void main(String[] args) {
	     
	    ArrayList arrayList = new ArrayList();

	 

	    arrayList.add("55");
	    arrayList.add("25");
	    arrayList.add("368");

	    System.out.println("Original ArrayList...");

	    for (int index = 0; index < arrayList.size(); index++)
	      System.out.println(arrayList.get(index));

	 
	    arrayList.set(1, "6");

	
	    System.out.println("ArrayList after replacement...");
	    for (int index = 0; index < arrayList.size(); index++)

	      System.out.println(arrayList.get(index));
	  }
	}
	
