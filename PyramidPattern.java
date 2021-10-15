package patternPrint;

public class PyramidPattern {
 
   public static void main(String []args) {
		
    int N=8;
    int M = N-1;
    int p=1;
    for(int i=N;i>0;i--) {
    	
    	
    	for(int j=0;j<M;j++) {
    		System.out.print(" ");
    	}
    	for(int k=0;k<p;k++ ) {
    		System.out.print("*");
    	}
    	System.out.println("");
    	M-=1;
    	p+=2;
    }
}
}

//sample output

/*

       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************

*/