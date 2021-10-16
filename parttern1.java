package patternPrint;

public class parttern1 {

	public static void main(String[] args) {
		int row =5,i=0,j=0;
		
		for( i=0;i<5;i++) {
			for( j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
   
       for( int k=i;k>0;k--) {
			for( j=0;j<k;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
//sample output
/*

*
**
***
****
*****
*****
****
***
**
*

*/