package spring.autowire.annotation;

public class Address {
	private String Street;
	private String City;
	

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + "]";
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		System.out.println("Setter is called"+street);
		Street = street;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public Address() {
		// TODO Auto-generated constructor stub
	}

}
