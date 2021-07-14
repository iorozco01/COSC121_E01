package E01;

public class Student extends Person{
	//Attributes
	public String status;
	
	//Constructors
	public Student() {
	}
	public Student(String name, String address, String phone, String email, String status) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		setStatus(status);
	}
	//Getter
	public String getStatus() {
		return status;
	}
	
	//Setters
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Name: " +  name + ", Address: " + address + ", Phone: " + phone + ", Email: " + email + ", Status: " + status;
	}
	
}
