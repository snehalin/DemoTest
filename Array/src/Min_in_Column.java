
public class Min_in_Column {

	public static void main(String[] args) {
		int a[][]={
				{10,1,2},
				{1,2,3},
				{5,4,9}
		};
		int b[]=new int[3];
		for(int i=0;i<3;i++)
		{
			int min=a[0][i];
			int j=0;
			if(min<a[i][j])
			{
				min=a[i][j];
			}
			j++;
			b[i]=min;
			System.out.println(b[i]);
		}

	
	}

}
