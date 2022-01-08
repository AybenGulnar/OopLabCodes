package labweeknine;

import java.util.ArrayList;

public class TeachingAssistant extends AssistingStaff implements CanAssistCourses, CanOverseeExams, CanAssistLabCourses{

	public TeachingAssistant(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public TeachingAssistant(Person person, String registry_number, float salary, Lab lab) {
		super(person, registry_number, salary, lab);
		// TODO Auto-generated constructor stub
	}

	public TeachingAssistant(String identity_no, String name, String registry_number, float salary,
			CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public TeachingAssistant(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}
	  public boolean EarnedHisSalary() {
			return false;
		}
	  public void AddCourse(CourseData course) {
		  
	  }

	@Override
	public void addExamOverseeingAssignment(Assignment ExamOverseeingAssignment) {
		if (ExamOverseeingAssignment instanceof ExamOverseeing) {
			ArrayList<Assignment> temp = super.getAssignments();
			temp.add(ExamOverseeingAssignment);
			super.setAssignments(temp);
		} else {
			System.out.println("exam oversee tipinde degil.");
		}

		
	}

	@Override
	public void addCourseAssistingAssignment(Assignment CourseAssistingAssignment) {
		super.getAssignments().add(CourseAssistingAssignment);
		/*
		if (CourseAssistingAssignment instanceof CourseAssisting) {
			ArrayList<Assignment> temp = super.getAssignments();
			temp.add(CourseAssistingAssignment);
			super.setAssignments(temp);
		} else {
			System.out.println("course assisting tipinde degil.");
		}*/

	
		 ArrayList<Assignment> temp2 = super.getAssignments(); for (int i = 0; i <
		 temp2.size(); i++) { System.out.println(temp2.get(i).getInfo()); } // for test
		
	}

	@Override
	public void addLabAssistingAssignment(Assignment LabAssistingAssignment) {
		if (LabAssistingAssignment instanceof LabCourseAssisting) {
			ArrayList<Assignment> temp = super.getAssignments();
			temp.add(LabAssistingAssignment);
			super.setAssignments(temp);
		} else {
			System.out.println("lab course assisting tipinde degil.");
		}
	}
		
}



