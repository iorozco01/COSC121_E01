package E01;

public class Employee extends Person {
	public String office; 
	public int salary;
	public java.util.Date dateHired;
	
	//Constructors
	public Employee() {		
	}
	public Employee(String name, String address, String phone, String email, String office, int salary, java.util.Date date) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setOffice(office);
		setSalary(salary);
		setDateHired(date);
	}
	//Methods
	//Getters
	public String getOffice() {
		return office;
	}
	public int getSalary() {
		return salary;
	}
	public java.util.Date getDateHired(){
		return dateHired;
	}
	
	//Setters
	public void setOffice(String office) {
		this.office = office;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDateHired(java.util.Date date) {
		this.dateHired = date;
	}
	
	@Override
	public String toString() {
		return "Name: " +  name + ", Address: " + address + ", Phone: " + phone + ", Email: " + email + ", Office: " + office + ", Salary " + salary + ", Date Hired: " + dateHired;
	}
}
	
