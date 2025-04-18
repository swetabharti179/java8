package javabasic;
//instance members get memory when you create an object
//access/call instance members with the help of object reference
//purpose of instance variable (when we should use instance variable)
// ans-if value  changes object to object 
// purpose of instance block 
//to initialize a instance variable other than constructor
//purpose of constructor 
//to initialize the variables 
//to create an object (to help in object creation )
public class InstanceMemberExample {
	 int a=m1();
	 int b=10;
	 {
		System.out.println(a);
		System.out.println(b);
	}
	 int m1() {
		System.out.println(a);
		return 20;
	}
	 public InstanceMemberExample() {
		 System.out.println("constructor" );
	}
public static void main(String[] args) {
	InstanceMemberExample instancememberexmaple = new InstanceMemberExample();
	
}

}
