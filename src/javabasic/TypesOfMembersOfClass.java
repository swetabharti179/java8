package javabasic;
//what is the difference and similarity between method and constructor
public class TypesOfMembersOfClass {
//Variables types (static or non static aka instance variable)
	static int a=m2();
	static {
		System.out.println("static block2");
	}

static int b;
{
	System.out.println("instance block 2");
}
int c=m3();
int d;
//Types of methods  (static or non static aka instance method)
static void m1() {
	System.out.println("m1()");
}
static int m2() {
	System.out.println("m2()");
	return 10;
}
int m3() {
	System.out.println("m3()");
	return 20;
}
void m4() {
	System.out.println("m4()");
}
//constructor  
TypesOfMembersOfClass(){
	System.out.println("constructor");
}
void TypesOfMembersOfClass(){}
// Types of block(static or non static aka instance block)
static {
	System.out.println("static block");
	
}
{
System.out.println("instance block");	
}
public static void main(String[] args) {
TypesOfMembersOfClass typesOfMembersOfClass=new TypesOfMembersOfClass();	
}

}
