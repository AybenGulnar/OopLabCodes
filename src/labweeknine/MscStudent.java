package labweeknine;

public class MscStudent extends GradStudent {


	public MscStudent(Person person, int enrollment_year, String student_number, CourseData[] taken_courses) {
		super(person, enrollment_year, student_number, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public MscStudent(Person person, int enrollment_year, String student_number) {
		super(person, enrollment_year, student_number);
		// TODO Auto-generated constructor stub
	}

	public MscStudent(String name, String identity_no, String student_number, int enrollment_year,
			CourseData[] taken_courses) {
		super(name, identity_no, student_number, enrollment_year, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public MscStudent(String name, String identity_no, String student_number, int enrollment_year) {
		super(name, identity_no, student_number, enrollment_year);
		// TODO Auto-generated constructor stub
	}

	public boolean checkGraduation() {
	
		 if(total_credit() >= 45){  System.out.println("kredi şartı sağlanmıştır.");
	            return true;
	        }
	        return false;
			
	}
	public int getPassedCredit() {
		return 0;
	} 
	//
}
