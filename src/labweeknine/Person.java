package labweeknine;
public class Person {


	private String identity_no;
	private String name;
	
	public Person(String identity_no, String name) {
		super();
		this.identity_no = identity_no;
		this.name = name;
	}
	public Person(Person person, String registry_number, float salary) {
		// TODO Auto-generated constructor stub
	}


	public Person(Person person) {
		// TODO Auto-generated constructor stub
	}
	public String getIdentity_no() {
		return identity_no;
	}

	public String getName() {
		return name;
	}

	public void setIdentity_no(String identity_no) {
		this.identity_no = identity_no;
	}

	public void setName(String name) {
		this.name = name;
	}
}

	
