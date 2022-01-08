package labweeknine;

import java.util.ArrayList;

public class Lecturer extends TeachingStaff implements CanInstructCourses {

	public Lecturer(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String identity_no, String name, String registry_number, float salary, CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}
	  public boolean EarnedHisSalary() {
			return false;
		}

	@Override
	public void addCourseInstructAssignment(Assignment InstructingAssignment) {
		// TODO Auto-generated method stub
		if (InstructingAssignment instanceof CourseInstructing) {
			ArrayList<Assignment> temp = super.getAssignments();
			temp.add(InstructingAssignment);
			super.setAssignments(temp);
		} else {
			System.out.println("Instructing Assignment tipinde degil.");
		}
	}
	public void paySalary() throws UMS_PaySalaryError {
        int credit = 0;
        for (int i = 0; i < super.getCourses().length; i++) {
            credit += super.getCourses()[i].getCredit();
        }

        if(credit < 12){
            UMS_PaySalaryError error = new UMS_PaySalaryError();
            error.setAcademic(this);
            ArrayList<String> causes = new ArrayList<String>();
            causes.add("Yeterli kredi yok");

            error.setCauses(causes);
            throw error;
        }
    }

}
