package javabasic;
//method syntax note- other than [] all are mandatory 
//[modifiers] <method return type> <method name>([arguments type]){}
public  class MethodExample{
//private,protected,static,synchronized,strictfp,abstract,native,transient and volatile are not permitted
	 int a;// abstract ,synchronized,native,strictfp are not permitted
//type 1 method return type void and without arguments
//type2 method return type other than void and without arguments 
//	type3 method return type void and  with arguments 
	 void m1(int a,int b) {
//	transient and volatile are not permitted 
		System.out.println(a);
		System.out.println(b);
	}
	void m2( char a,String b,int c,boolean t) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(t);
	}
	 void m3( int a) {
		System.out.println(a);
	}
	
	
//	type4 method return type other than void and with arguments 
	String m4(int a,boolean f,String g) {
		System.out.println(a);
		System.out.println(f);
		System.out.println(g);
		return g;
	}
	int add ( int a,int b,int c,int d){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		return a+b+c+d;
	}
	int substract (int a,int b){
		System.out.println(a);
		System.out.println(b);
		 return a-b;
	}
	 int multiply (int c,int d){
		System.out.println(c);
		System.out.println(d);
		return c*d;
	}
	int  divide (int e,int f) {
		System.out.println(e);
		System.out.println(f);
		return e/f;
	}
	public static void main(String[] args) {
		MethodExample me = new MethodExample();
//		me.m1(10, 20);
//		me.m2('a', "sweta",30 , false);
//		me.m3(40);
//		String result= me.m4(50, true ,"sir" );
//		System.out.println(result);
//		int result = me.add(10, 20, 30, 40);
//		System.out.println(result);
//		int result= me.substract(20, 10);
//		System.out.println(result);
//		int result = me.multiply(45,55);
//		System.out.println(result);
		int result= me.divide(100, 5);
		System.out.println(result);
		
		
	}
		
		
		
	
	
}
