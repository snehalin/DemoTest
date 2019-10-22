
public class MyDate {

int day,month,year;

	
	
	public MyDate(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}



	
	@Override
	public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year ;
	}

}
