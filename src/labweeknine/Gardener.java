package labweeknine;

public class Gardener extends MaintanenceStaff{

	public Gardener(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public Gardener(Person person, String registry_number, float salary, Locations[] responsibilit_array) {
		super(person, registry_number, salary, responsibilit_array);
		// TODO Auto-generated constructor stub
	}

	public Gardener(String identity_no, String name, String registry_number, float salary, CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public Gardener(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}
	  public boolean EarnedHisSalary() {
			return false;
		}
	  public void AddResponsibility(Locations[] location) {
			
		}
}
