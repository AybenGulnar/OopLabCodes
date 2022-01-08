package labweeknine;

public class TechStaff extends Employee {

	public TechStaff(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public TechStaff(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}
	
	public void AddAssignment(String assignment) {
		
	}
}
