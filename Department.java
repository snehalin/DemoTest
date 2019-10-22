
public class Department {

	int dept_id;
	String name;
	public Department(int dept_id, String name) {
		super();
		this.dept_id = dept_id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", name=" + name + "]";
	}
	
	
	
	
}
