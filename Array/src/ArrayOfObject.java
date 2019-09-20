import java.util.Scanner;

class Dept
{
	private int did;
	private String dname;
	
	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
	
	
}

class MyDate
{
	int day,month,year;

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}

class Employee
{
	int id;
	String name;
	double salary;
	MyDate md;
	Dept d;
	public Employee(int id, String name, double salary, MyDate md, Dept d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.md = md;
		this.d = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getMd() {
		return md;
	}
	public void setMd(MyDate md) {
		this.md = md;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", md=" + md + ", d=" + d + "]";
	}
	
}
public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e[]=new Employee[2];
		MyDate m1=new MyDate(1,1,2019);
		Dept d1=new Dept(101,"CSE");
		MyDate m2=new MyDate(11,1,2018);
		Dept d2=new Dept(101,"ENTC");
		MyDate m[]=new MyDate[2];
		Dept d[]=new Dept[2];
		m[0]=m1;
		m[1]=m2;
		d[0]=d1;
		d[1]=d2;
	//	e[0]=new Employee(1,"Akshay",20000,m1, d1);
		//e[1]=new Employee(2,"Pravin",20000,m2,d2);
	Scanner s=new Scanner(System.in);
	
		for(int i=0;i<2;i++)
		{System.out.println("Enter id,name,salary");
			e[i]=new Employee(s.nextInt(),s.next(),s.nextDouble(),m[i],d[i]);
		}
		
		
		if(e[0].getSalary()==e[1].getSalary())
		{
		System.out.println(e[0]);
		System.out.println(e[1]);
		}
		else
			System.out.println("Salary is different");
		
		
		
	}

}
