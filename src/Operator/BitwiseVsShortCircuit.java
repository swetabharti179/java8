package Operator;

public class BitwiseVsShortCircuit {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		if (a++<b & b++>a){// in both case boolean and for integral same for &&
			System.out.println("inside if block");
		}
			System.out.println(a);
			System.out.println(b);
			
			
		
			
	}

}
