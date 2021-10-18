package patternPrint;
import java.util.Scanner;
public class SandglassStarPattern {

	public static void main(String[] args) {
		int row;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of row : ");
		row =in.nextInt();
		int Pattern=row;
		for(int i =0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<Pattern;k++) {
				System.out.print("*" + " ");
			}
			Pattern--;
			System.out.println(" ");
		}
		
		Pattern =1;
		for(int i =row-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<Pattern;k++) {
				System.out.print("*" + " ");
			}
			Pattern++;
			System.out.println("");
		}
		in.close();

	}

}

//sample output

/*

Enter the number of row : 8
* * * * * * * *  
 * * * * * * *  
  * * * * * *  
   * * * * *  
    * * * *  
     * * *  
      * *  
       *  
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 

*/