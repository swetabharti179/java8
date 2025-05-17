package ControlFlow;

public class Pattern3 {
	public static void main(String[] args) {
		int rc=4;
		int bc=3;
		int sc=1;
		for( int i=0;i<rc;i++) {
//		 to print number of blank count	
			for (int j=0;j<bc;j++) {
				System.out.print(" ");
//				
			}
//			to print number of star count
			for(int k=0;k<sc;k++) {
				System.out.print("*");
			}
			bc--;
			sc+=2;
			System.out.println();
			
			
		
		}
		
		
	}

}
