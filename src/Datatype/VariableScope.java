package Datatype;

public class VariableScope {
	{
	System.out.println(a);	// access nhi hoga kyuki 7 se start h 24 tk apn niche dekhte h scope ko
	
	}	
int a=10;// scope is from line 8 to end }
{
	 int h=40;// local variable 
	 int b=20;// local variable - inside 
	System.out.println(a);// it will print 40 because local variable is more precedence
}
public void m1() {
	int c=30;
	System.out.println(b);
	System.out.println(a);
	{
	System.out.println(c);	
	}
}
{
System.out.println(c);	
}

public static void main(String[] args) {
	
}
}
