import java.util.Scanner;
public class DownwardTriangleStarPattern {

	public static void main(String[] args) {
		
         int row;
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the row : ");
         row = in.nextInt();
         int col =row;
         for(int i=0;i<row;i++) {
        	 for(int j=0;j<col;j++) {
        		 System.out.print("*" + " ");
        	 }
        	 col--;
        	 System.out.println("");
         }
	}

}

//sample output

/*

Enter the row : 7
* * * * * * * 
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
