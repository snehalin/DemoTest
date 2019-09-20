import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		//String name[];
		//name=new String[5];
		String name[]=new String[5];
		/*name[0]="abc";
		name[1]="pxyz";
		name[2]="qxyz";
		name[3]="rxyz";
		name[4]="mxyz";
		name[0]='a';
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 full names");
		
		for(int i=0;i<name.length;i++)
			name[i]=sc.nextLine();
		
		
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("__________");
		for(String x:name)
			System.out.println(x);
	}

}
