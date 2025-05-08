package Operator;
//pre increment means -first increase the value then assign/print
//post increment means-first print value then increase
public class IncrementOperator {
	public static void main(String[] args) {
//		pre and post increment
		int a=10;
//		a++;
		++a;
		System.out.println(a);
		int b=10;
//		System.out.println(b++);
		int c=10;
		c=c++ +c+c-- -c-- + ++c;//value assignment
		System.out.println(c);
		int d=10;
		System.out.println(++d +d++ +d - --d +d--);//expression
//		expression evaluation left to right 
//		value assignment right to left 
//		int e=10++;// increment or decrement operator applicable for variables only
//		not for constant
		final int f=10;// compile time constant - final
		System.out.println(f);	
		
		
		
		
			
		
	}

}
