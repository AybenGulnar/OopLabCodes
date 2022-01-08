package labweeknine;

import java.util.ArrayList;

public class AssocProfessor extends TeachingStaff implements CanInstructCourses, CanConductResearch{

	public AssocProfessor(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}

	public AssocProfessor(String identity_no, String name, String registry_number, float salary, CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public AssocProfessor(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}
	  public boolean EarnedHisSalary() {
			return false;
		}


	  @Override
		public void addResearch(Research research) {
			ArrayList<Research> temp = super.getResearchs();
			temp.add(research);
			super.setResearchs(temp);
			
		}

		@Override
		public String getResearch() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public void addCourseInstructAssignment(Assignment InstructAssignment) {
			// TODO Auto-generated method stub
			if (InstructAssignment instanceof CourseInstructing) {
				ArrayList<Assignment> temp = super.getAssignments();
				temp.add(InstructAssignment);
				super.setAssignments(temp);
			} else {
				System.out.println("Instructing Assignment tipinde degil.");
			}
			
		}

		
}
