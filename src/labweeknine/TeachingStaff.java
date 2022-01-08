package labweeknine;

import java.util.ArrayList;

public class TeachingStaff extends Academics{
	private String office_hours;
	private Office office;

	public TeachingStaff(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public TeachingStaff(String identity_no, String name, String registry_number, float salary, CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public TeachingStaff(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public TeachingStaff(Person person, String registry_number, float salary, Office office) {
		super(person, registry_number, salary);
		this.office = office;
	}

	public String getOffice_hours() {
		return office_hours;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice_hours(Office new_office_hours) {
		this.office_hours = office_hours;
	}

	public void setOffice(Office new_office) {
		this.office = office;
	}

	public void setOffice_hours(String office_hours) {
		this.office_hours = office_hours;
	}


	public void AddCourse(CourseData course) {
			
	 }

	public ArrayList<Research> getResearchs() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setResearchs(ArrayList<Research> temp) {
		// TODO Auto-generated method stub
		
	}
	
	public  void PaySalary() throws UMS_PaySalaryError{
		int credit= 0;
		boolean grad = false;
		boolean undergrad = false;
		
		for (int i = 0; i < super.getCourses().length; i++) {
			
			credit = super.getCourses()[i].getCredit();
			if (super.getCourses()[i] instanceof GradCourseData ) {
				grad = true;
			} 		
			
			if (super.getCourses()[i] instanceof UnderGradCourseData ) {
				undergrad = true;
			} 	
		}
		if (credit < 12 || !grad || !undergrad) {
			UMS_PaySalaryError error = new UMS_PaySalaryError();
			error.setAcademic(this);
			ArrayList<String> causes = new ArrayList<String>();
			
			if (credit < 12) {
				causes.add("yeterli kredi yok");
				
			if (!grad) {
				causes.add("en az grad bir olmalý ");
					
			if (!undergrad) {
				causes.add("En az bir undergrad olamlý");
				
			}
			error.setCauses(causes);
			throw error;
		}
			
		}
			
		}
		
	
	
	}
}

	

