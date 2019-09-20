
public class CW5 {

	public static void main(String[] args) {
		int a[]={1,2,-2,-4,5,-7,8};
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		int i,j=0,k=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[j]=a[i];
				j++;
			}
			else
			{
				c[k]=a[i];
				k++;
			}
		}
		
		//copy b to a
		for(i=0;i<j;i++)
		{
			a[i]=b[i];
		}
		//copy c to a
		k=0;
		for(j=i;j<a.length;j++)
		{
			a[j]=c[k];
			k++;
		}
		
	
				for(i=0;i<b.length;i++)
				{
					System.out.println(a[i]);
				}

	}

}
