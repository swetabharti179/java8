package ControlFlow;

public class Pattern2 {
	public static void main(String[] args) {
		int rc=4;
		int bc=3;
		int sc=1;
		for(int i=0;i<rc;i++) {
//			to print blank count
			for(int j=0;j<bc;j++) {
				System.out.print(" ");
			}
//			to print  number star count
			for(int k=0;k<sc;k++) {
				System.out.print("*");
			}
			bc--;
			sc++;
			System.out.println();
		}
	}

}
