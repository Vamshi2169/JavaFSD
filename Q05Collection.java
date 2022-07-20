import java.util.*;

public class Q05Collection {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Kolkata");//
	      city.add("Bangalore");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector<Integer>();
	      vec.addElement(20); 
	      vec.addElement(38); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Saptarshi");  
	      names.add("Mondal");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(110);  
	       set.add(120);  
	       set.add(130);
	       set.add(140);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(21);  
	       set2.add(23);  
	       set2.add(12);
	       set2.add(29);	       
	       System.out.println(set2);
	      	} 
	      }  
	}
