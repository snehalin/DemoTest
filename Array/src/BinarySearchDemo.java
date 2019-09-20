import java.util.Scanner;
public class BinarySearchDemo {

	public static void main(String[] args) {
		int n,mid,l,r,key;
		boolean flag=false;
		System.out.println("Enter total no. of elemets");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		l=0;
		r=n-1;
		
		System.out.println("Enter "+n+" elemets in ascending order");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter  no. to be searched");
		key=sc.nextInt();

		
			while(l<=r)
		
		{
			mid=(l+r)/2;
			if(a[mid]==key)
			{
				flag=true;
				System.out.println("Present at "+(mid+1));
				break;
			}
			else
			{
				if(key<a[mid])
					r=mid-1;
				else
					l=mid+1;
			}//else
			
				
		}//while close
		
		
		
	}

}
