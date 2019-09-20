
public class TwoDPrint {

	public static void main(String[] args) {
	int a[][]={
				{21,22,23},
				{11,12,13}
	};
	/*for(int i=0;i<2;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	*/
	for(int i[]:a)
	{
		for(int j:i)
		{
		System.out.print(j+" ");
		}
		System.out.println();
	}
	

	}

}
