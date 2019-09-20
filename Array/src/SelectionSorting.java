import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		System.out.println("Enter total no. of elemets");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
				
		System.out.println("Enter "+n+" elemets ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
				
			}
		int t=a[i];
		a[i]=a[min];
		a[min]=t;
		
		}
		

		System.out.println("Sorted elemets are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
