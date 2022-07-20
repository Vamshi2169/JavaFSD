//Inner class-1
 class InnerClassAssisted1 {
 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){ 
		  System.out.println(msg+", Let us start learning Inner Classes");
		  }
	 }
}
 
class InnerClassAssisted2 {
	  private String msg="Inner Classes";

	  void display(){  
	 	 class Inner{  
	 		 void msg(){
	 			 System.out.println(msg);
	 		 }  
	   }  
	   
	   Inner l=new Inner();  
	   l.msg();
	 }  
}

//Anonymous Inner class
abstract class AnonymousInnerClass {
	   public abstract void display();
	}

	  public class Q07InnerClass {
	public static void main(String[] args) {

		InnerClassAssisted1 obj=new InnerClassAssisted1();
		InnerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
		
		InnerClassAssisted2  ob=new InnerClassAssisted2 ();  
		ob.display();  
		
		
			AnonymousInnerClass i = new AnonymousInnerClass() {

			         public void display() {
			            System.out.println("Anonymous Inner Class");
			         }
			      };
			      i.display();
			   }
		}