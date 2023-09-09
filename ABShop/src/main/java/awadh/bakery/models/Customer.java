package awadh.bakery.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id",nullable=false)
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

	@Column
	@NotEmpty(message = "Name cannot be empty")
    private String name;
    
	@Column
    @Email(message = "Invalid email format")
    private String email;
    
	@Column
    @Pattern(regexp = "\\d{10}", message = "Invalid phone number format")
    private String phone;
	@Column
	@NotEmpty(message = "Address cannot be empty")
    private String address;

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + "]";
	}

    // Getters and setters
}
