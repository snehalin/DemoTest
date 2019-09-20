
public class Frequency {

	public static void main(String[] args) {
		int a[]={1,2,1,5,4,3,3,2};
		int cnt=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{cnt=0;
		flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					for(int k=i-1;k>=0;k--)
					{
						if(a[i]==a[k])
						{
							flag=true;
						}
					}
				}
			}
			if(flag==false)
			{
				System.out.println(a[i]+"=>"+cnt);
			}
		}
	}

}
