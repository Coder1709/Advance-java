package spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	Address address;
	

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}


	public Emp() {
		// TODO Auto-generated constructor stub
	}

}
