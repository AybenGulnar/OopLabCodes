package labweeknine;

public class EmeritusProfessor extends TeachingStaff{

	public EmeritusProfessor(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public EmeritusProfessor(String identity_no, String name, String registry_number, float salary,
			CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public EmeritusProfessor(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}
    public boolean EarnedHisSalary() {
		return false;
	}

}
