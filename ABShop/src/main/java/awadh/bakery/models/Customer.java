package awadh.bakery.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
@Entity
public class Customer {
	
	private int custID;
	
    public Customer(int custID, @NotEmpty(message = "Name cannot be empty") String name,
			@Email(message = "Invalid email format") String email,
			@Pattern(regexp = "\\d{10}", message = "Invalid phone number format") String phone, String address) {
		super();
		this.custID = custID;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
    public Customer() {}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@NotEmpty(message = "Name cannot be empty")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "\\d{10}", message = "Invalid phone number format")
    private String phone;

    private String address;

    // Getters and setters
}
