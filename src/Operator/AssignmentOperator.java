package Operator;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a=10;
		int x,y,z;
		x=y=z=20;
		x=30;
		y=40;
		z=50;
//		int p=q=r=40;// not valid
		int b=10;
		b=b+1;
//		b+=2;//(b=b+1)
	//	b++;
		b-=2;//b=b-2
		b*=2;//b=b*2
		System.out.println(b);
		
	}
	

}
