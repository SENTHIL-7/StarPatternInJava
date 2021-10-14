

public class LeftTriangle {

	public static void main(String[] args) {
		  int row=8;
	      int i,j;
	      int mid =0;
	      mid =row-1;
	      int n=1;
	      
	      for(i=row;i>0;i--) {	    	 
	    	  for(j=0;j<mid;j++) {
	    		  System.out.print(" ");    
	    	  }	    	 
	    	  if(n<=row) {
	    		 for(i=1;i<=n;i++) {
	    			 System.out.print("*"); 
	    		 } 
	    	  }
	    	  System.out.println("");
	    	  mid-=1;
	    	  n =n+1;
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
  ******
 *******
********  

  
*/
