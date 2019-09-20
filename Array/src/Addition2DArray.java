import java.util.Scanner;
public class Addition2DArray {
void add()
{
	
}
void add(int a)
{
	
}
int add(float b)
{
	return 1;
}
	public static void main(String[] args) {
		int r=3,c=3;
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int sum[][]=new int[r][c];
		System.out.println("Enter "+(r*c)+"elemets for first array");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter "+(r*c)+"elemets for second array");
		//Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("elemets of first array");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
System.out.println("elemets of Second array");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
	}
		
System.out.println("sum of 2  arrays are");
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("sum of 2  arrays using for each");	
		
		for(int[] x:sum)
		{
			for(int y:x)
			{
				System.out.print(y);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
