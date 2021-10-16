

public class LeftTriangle {

	public static void main(String[] args) {
        int row;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row : ");
        row = in.nextInt();
        int Space =row-1;
        
        for(int i=0;i<row;i++) {
        	for(int j=0;j<Space;j++) {
        		System.out.print(" ");
        	}
        	Space--;
        	for(int k=0;k<=i;k++) {
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
  ******
 *******
********  

  
*/
