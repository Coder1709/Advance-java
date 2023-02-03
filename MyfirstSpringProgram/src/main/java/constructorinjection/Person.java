package constructorinjection;

public class Person {
	private int pId;
	private String pName;

	public Person(int pId, String pName) {
		this.pId = pId;
		this.pName = pName;
	}

	@Override
	public String toString() {
		return this.pId+ " : "+this.pName;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
