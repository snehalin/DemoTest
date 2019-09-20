
public class Smallest {

	public static void main(String[] args) {
		int b[][]={{10,12,9},
				   {1,4,7},
				   {3,8,15}};
	/*int smallest=b[0];
	for(int i=0;i<3;i++)
	{
		if(b[i]<smallest)
		{
			smallest=b[i];
		}
			
	}*/
	//System.out.println(smallest);
		
		for(int i=0;i<3;i++)
		{int smallest=b[0][i];
			for(int j=0;j<3;j++)
			{
				
				if(b[j][i]<smallest)
				{
					smallest=b[j][i];
				}
				
			}
			System.out.println(smallest);
		}
		
		
		

	}

}
