import java.util.Scanner;

public class TwoD_Demo {

	public static void main(String[] args) {
		int a[][];
		Scanner sc=new Scanner(System.in);
		 a=new int[3][];
		
		 System.out.println("Enter row");
		 int r=sc.nextInt();
		 
		 for(int i=0;i<r;i++)
		{   
			 System.out.println("Enter"+(i+1)+" column");
			 int c=sc.nextInt();
			 a[i]=new int[c];
			 System.out.println("Enter"+c+"Elements");
			for(int j=0;j<a[i].length;j++)
			{				
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
