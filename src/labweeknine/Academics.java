package labweeknine;

import java.util.ArrayList;

public class Academics extends Employee{
private CourseData courses[] = {};
private ArrayList<Assignment> assignments;
private ArrayList<Research> researchs;



	public Academics(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
		this.researchs = new ArrayList<Research>();
	}

	public Academics(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	
		this.assignments = new ArrayList<Assignment>();
		this.researchs = new ArrayList<Research>();
	}

	public Academics(String identity_no, String name, String registry_number, float salary, CourseData[] courses) {
		super(identity_no, name, registry_number, salary);
		this.courses = courses;
	}

	public CourseData[] getCourses() {
		return courses;
	}

	public void setCourses(CourseData[] courses) {
		this.courses = courses;
	}

	 public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}

	public void AddCourse(CourseData course) {
	
}

	public void addCourseInstructAssignment() {
		// TODO Auto-generated method stub
		
	}
}
