package Operator;
//> <  >= <= to check relationship (applicable for all primitive type except boolean type)
// equality check symbol -  == !=(not equal to)(applicable for all boolean type including boolean)
//note  equality operator is also applicable for object reference 
// but applicable for object reference relational operator is not 

public class RelationalOperator {
	public static void main(String[] args) {
//		System.out.println(10>20);
		int gazalaAge=18;
		int swetaAge=20;
		System.out.println(gazalaAge<swetaAge);
		System.out.println(gazalaAge<=swetaAge);
		System.out.println(gazalaAge>swetaAge);
		System.out.println(gazalaAge>=swetaAge);
		System.out.println(gazalaAge==swetaAge);
		System.out.println(gazalaAge!=swetaAge);
		boolean a=true;
		boolean b=false;
//		System.out.println(a>b);
		int c=150;
		byte d=(byte)c;
		System.out.println(d);
	}

}
