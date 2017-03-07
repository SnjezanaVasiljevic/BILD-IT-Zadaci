package zadaci_07_03_2017;

public class Person {
	// name,address, phone number, and email address
	private String name;
	private String address;
	private String phone;
	private String email;

	public Person() {

	}
	public Person(String name) {
		this.name = name;
	}

	public Person(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nAddress: " + this.address + "\nPhone: " + this.phone + "\nE-mail: "
				+ this.email;
	}

}
