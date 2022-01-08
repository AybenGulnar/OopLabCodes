package labweeknine;

import java.util.ArrayList;

public class AssistingStaff extends Academics{
private Lab lab;

	public AssistingStaff(Person person, String registry_number, float salary, Lab lab) {
	super(person, registry_number, salary);
	this.lab = lab;
}

	public AssistingStaff(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public AssistingStaff(String identity_no, String name, String registry_number, float salary, CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public AssistingStaff(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public Lab getLab() {
		return lab;
	}

	public void setLab(Lab lab) {
		this.lab = lab;
	}
	

	public  void PaySalary() throws UMS_PaySalaryError{
		int courseAssisting = 0;
		int examOversees = 0;
		
		for (int i = 0; i < super.getAssignments().size(); i++) {
			if (super.getAssignments().get(i) instanceof CourseAssisting) {
				courseAssisting++;
			}
			else if (super.getAssignments().get(i) instanceof ExamOverseeing) {
				examOversees++;
			
			}
			if (examOversees <5 || courseAssisting < 2) {
				UMS_PaySalaryError  error = new UMS_PaySalaryError();
				error.setAcademic(this);
				ArrayList<String> causes = new ArrayList<String>();
				
				if (examOversees < 3) {
					causes.add("5 sýnav görevi olmalý");
				}
				if (courseAssisting < 2)
				{
					causes.add("asiste edilen 2 ders olamlý");
				}
				error.setCauses(causes);
				throw error;
			}
		}
			
	}
		
	

}
