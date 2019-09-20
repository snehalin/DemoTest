import java.util.Scanner;
public class MergeArrayDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  1st arrays total no. of elements");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" Elements");
		
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		System.out.println("Enter  2nd arrays total no. of elements");
		int n1=s.nextInt();
		int b[]=new int[n1];
		System.out.println("Enter "+n1+" Elements");
		
		for(int i=0;i<b.length;i++)
			b[i]=s.nextInt();
		System.out.println("1st Array Elements:-");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		System.out.println("2nd Array Elements:-");
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		int c[]=new int[a.length+b.length];
		System.out.println("c length="+c.length);
		int j;
		
		for( j=0;j<a.length;j++)
			c[j]=a[j];
		
		for(int i=0;i<b.length;i++)
		{
				c[j]=b[i];
				j++;
		}
		
		
		System.out.println("C's Contents:-");
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);

	}

}
