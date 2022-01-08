package labweeknine;

public class ITGuy extends TechStaff{

	public ITGuy(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public ITGuy(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public boolean EarnedHisSalary() {
		return false;
		
	}
}
