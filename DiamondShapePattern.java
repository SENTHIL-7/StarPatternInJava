import java.util.Scanner;

public class DiamondShapePattern {

	public static void main(String[] args) {
		int row;
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the row : ");
		row =in.nextInt();
		int i,j,k;
		int Space = row-1;
		int pattern = 1;
		
		
		for(i=0;i<row;i++) {
			for(j=0;j<Space;j++) {
				System.out.print(" ");
			}
			
			for(k=0;k<pattern;k++) {
				System.out.print("*");
			}
			System.out.println("");
			pattern +=2;
			Space--;
			
		}
		for(;i-1>0;i--) {
			pattern -=2;
			Space++;
			for(j=0;j<=Space;j++) {
				System.out.print(" ");
			}
			
			for(k=1;k<pattern-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
			
			
			
		}
		
		
		
	}

}
