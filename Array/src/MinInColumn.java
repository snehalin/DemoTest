
public class MinInColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={

				{10,1,2},
				{1,2,3},
				{5,4,9}
			};
				
	for(int i=0;i<3;i++)
		{
		int min=a[0][i];
		 for(int j=1;j<3;j++)
				{
			 	if(a[j][i]<min)
			 		min=a[j][i];
			
				}
		 System.out.print(min+" ");
	
	}
	//int b[][]=new int[3][3];
		// System.out.print(b[0][0]);
	/*for(int i=0;i<3;i++)
	{
		int min=a[i][0];
		System.out.println("a["+i+"]["+0+"]="+a[i][0]);
	 for(int j=0;j<3;j++)
			{
		 	if(a[j][i]<min)
		 		min=a[j][i];
		 	System.out.print(a[j][i]+"\t ");
			}
	 System.out.println();
	System.out.println(min+"\n");
}*/
}
}