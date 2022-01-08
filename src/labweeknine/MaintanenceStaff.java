package labweeknine;

public class MaintanenceStaff extends Academics{
	private Locations responsibilit_array[] = {};

	public MaintanenceStaff(Person person, String registry_number, float salary, Locations[] responsibilit_array) {
		super(person, registry_number, salary);
		this.responsibilit_array = responsibilit_array;
	}

	public MaintanenceStaff(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public MaintanenceStaff(String identity_no, String name, String registry_number, float salary,
			CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public MaintanenceStaff(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public Locations[] getResponsibilit_array() {
		return responsibilit_array;
	}

	public void setResponsibilit_array(Locations[] responsibilit_array) {
		this.responsibilit_array = responsibilit_array;
	}
	public void AddResponsibility(Locations[] location) {
		
	}

}
