package springcore.auto.wire;

public class Emp {
	private Address address;

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

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		System.out.println("Inside Constructor");
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
