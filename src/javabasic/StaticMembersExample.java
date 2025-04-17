package javabasic;
//static members will get memory at class loading time 
//static members are related to class not an object
//we can access /call static members (variable and method)with class name 
//example Dog.name; Dog.eat();
//static members get memory only once in their life hence memory utilization is better than instance members
//purpose of static variable(when we should choose static variable) if object to object data is not changing 
//purpose of  static method (for utility )
//purpose of static block 
//1.to initialize static variable 
//2.to load something at class loading time 

public class StaticMembersExample {
static int a=m1();
static int b=10;
static {
	System.out.println(a);
	System.out.println(b);
}
static int m1() {
	System.out.println(a);
	return 20;
}
public static void main(String[] args) {
	System.out.println("*********");
System.out.println(StaticMembersExample.a);
System.out.println(StaticMembersExample.b);
System.out.println(StaticMembersExample.m1());
System.out.println("another way of calling applicable within a same  class only");
System.out.println(a);
System.out.println(b);
System.out.println(m1());
}


}
