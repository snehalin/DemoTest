
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,5,10,11,12};
		int mid,l,r,key=5;
		l=0;
		r=a.length-1;
		boolean flag=false;
		while(l<=r)
		{
			mid=(l+r)/2; //(0+2)/2=1
			if(a[mid]==key)
				{flag=true;
					System.out.println(key+" found at position "+mid);
					break;
				}
		   if(key>a[mid])
		   		{
			   l=mid+1;
		   		}
		   else
		   {
			r=mid-1;
		   }
		
		}//while
		if(flag==false)
		System.out.println("not found");
	}

}
