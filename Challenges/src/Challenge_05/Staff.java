package Challenge_05;

public class Staff {

	String staffName;
	String staffID;
	int salary;

	public Staff() {

	}

	public Staff(String staffName, String staffID, int salary) {
		this.staffName = staffName;
		this.staffID = staffID;
		this.salary = salary;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void staffInfo() {
		System.out.println(
				"Staff name : " + this.staffName + ", Staff ID : " + this.staffID + ", Salary : " + this.salary);
	}
}
