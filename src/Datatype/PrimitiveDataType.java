package Datatype;

public class PrimitiveDataType {
////byte  wrapper class Byte 
	//short wrapper class Short
	//int wrapper class Integer	
	//long wrapper class Long
	//float wrapper class Float
	//double wrapper class Double
	//char wrapper class Char
	//boolean wrapper class Boolean
	public int a=10;      //it can be access from anywhere (within the same class, within the same package
	                     //from different package 
	protected int b=20;  //it can be accessed (within the same class, within the same package 
	// from different package but with child reference only )
	int c=30; // it can be accessed from (within the same class, within the same package only
	private int d=40; //it can be accessed within the same class only
	//here int is a data type a is a variable name, = is an assignment operator which is used to assign the 
	//value to the variable from right to left
	//10 is a value | state | literal
	//; statement terminator | statement completion in java 
	public static void main(String[] args) {
		PrimitiveDataType dt= new PrimitiveDataType();
		System.out.println(dt.a);
		System.out.println(dt.b);
		System.out.println(dt.c);
		System.out.println(dt.d);
		
	}
	}
	

