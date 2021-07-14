package E01;

public class Person {
	//Attributes
	public String name;
	public String address;
	public String phone;
	public String email;
	
	//Constructors
	public Person() {
	}
	public Person(String name, String address, String phone, String email) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
	}
	
	//Methods
	//Getters
	public String getName(){
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Name: " +  name + ", Address: " + address + ", Phone: " + phone + ", Email: " + email;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
