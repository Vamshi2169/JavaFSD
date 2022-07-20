class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Q04Constructor {
public static void main(String[] args) {
	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	
	System.out.println();
	

	Std std1=new Std(6,"Saptarshi");
	Std std2=new Std(10,"Gourav");
	std1.display();
	std2.display();
		}
}