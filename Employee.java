
public class Employee {
	int empid;
	double salary;
	String name;
	Department d1;
	MyDate m1;
	
	public Employee(int empid, double salary, String name, Department d1, MyDate m1) {
		//super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
		this.d1 = d1;
		this.m1 = m1;
	}
	

	@Override
	public String toString() {
		return "\n\nEmployee [empid=" + empid + ", salary=" + salary + ", name=" + name +
				", d1=" + d1 + ", m1=" + m1 + "]";
	}

	/*void display()
	{
		System.out.println("empid=" + empid + ", salary=" + salary+" Did = "
	+d1.dept_id+"name  "+d1.name+" Date ="+m1.day+"/"+m1.month+"/"+m1.year);
	}*/

	public static void main(String[] args) {
		Department d1 = new Department(2,"comp");
		MyDate m1 = new MyDate(6,9,2019);
		Employee e1 = new Employee(12,20000,"Vitthal",d1,m1);
		System.out.println(e1);
		//e1.display();
	}

}
