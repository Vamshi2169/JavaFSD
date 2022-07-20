class MethodExecution {

public int multipynumbers(int a,int b) {
	int z=a*b;
	return z;
}
}
 class CallMethod {

int val=123;

int operation(int val) {
	val =val*10/100;
	return(val);
}
}

 class OverloadMethod {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }
}

public class Q03Methods {
	public static void main(String []args) {
		MethodExecution b=new MethodExecution();
		int ans= b.multipynumbers(9,6);
		System.out.println("Multipilcation is :"+ans);
		
		System.out.println();
		
		CallMethod d = new CallMethod();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);
		
		System.out.println();
		
		OverloadMethod ob=new OverloadMethod();
	       ob.area(15,14);
	       ob.area(7);  
		}
		
}