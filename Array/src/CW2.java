
public class CW2 {

	void add(int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+1);
		}
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,8};
		CW2 obj=new CW2();
		obj.add(a);
		
	}

}
