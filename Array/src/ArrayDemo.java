import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
	int arr[]=new int[5];//
	arr[0]=11;
	arr[2]=12;
	arr[1]=13;
	arr[4]=-10;
	arr[3]=-14;
	//arr[5]=9;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	
	System.out.println("--------------------");
	for(int x:arr)
	{
		System.out.println(x);
	}
	System.out.println("\n Enter 5 elements");
	Scanner sc=new Scanner(System.in);
	/*arr[0]=sc.nextInt();
	arr[1]=sc.nextInt();
	arr[2]=sc.nextInt();
	arr[3]=sc.nextInt();
	arr[4]=sc.nextInt();*/
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("a["+i+"]="+arr[i]);
	}
		
		
		
		
	System.out.println("Using for each below");
		
		
		
	for(int x:arr)
	{
		System.out.println(x);
	}
	}

}
