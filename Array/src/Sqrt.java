import java.util.TreeSet;

public class Sqrt {

	public static void main(String[] args) {
		/*int n=25;
		double temp,sqrt=0;
		
		sqrt=n/2;
		 do
		 {
			 temp=sqrt;
			 sqrt=(temp+(n/temp))/2;
			 System.out.println("temp="+temp+"sqrt="+sqrt);
			 
		 }while(temp-sqrt!=0);
		
	
		 System.out.println(sqrt);*/
		 
		 
		 
		 
			TreeSet<Integer> t=new TreeSet<Integer>();
			t.add(2);
			t.add(1);
			t.add(4);
			//t.add("string");
			t.add(7);
			t.add(20);
			t.add(8);
			System.out.println(t.higher(7));
			System.out.println("t.floor(6)="+t.floor(6));
			System.out.println(t.ceiling(7));
			System.out.println(t.last());
			Integer o=t.first();
			t.remove(o);
			System.out.println(t);
	}
}
