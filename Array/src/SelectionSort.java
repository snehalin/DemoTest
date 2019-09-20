
public class SelectionSort {

	public static void main(String[] args) {
		int a[]={5,4,3,2,1};
		int min;
		for(int i=0;i<a.length-1;i++)
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
				 
			}//swap
				int t=a[i];
				a[i]=a[min];
				a[min]=t;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
