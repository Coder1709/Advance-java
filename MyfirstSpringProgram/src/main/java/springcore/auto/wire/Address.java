package springcore.auto.wire;

public class Address {
	private String street;
	private String city;
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("setter is called"+street);
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
