package labweeknine;


public class GradStudent extends Student {


	
	  public GradStudent(Person person, int enrollment_year, String student_number, CourseData[] taken_courses) {
		super(person, enrollment_year, student_number, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public GradStudent(Person person, int enrollment_year, String student_number) {
		super(person, enrollment_year, student_number);
		// TODO Auto-generated constructor stub
	}

	public GradStudent(String name, String identity_no, String student_number, int enrollment_year,
			CourseData[] taken_courses) {
		super(name, identity_no, student_number, enrollment_year, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public GradStudent(String name, String identity_no, String student_number, int enrollment_year) {
		super(name, identity_no, student_number, enrollment_year);
		// TODO Auto-generated constructor stub
	}

	public void addCourse(CourseData course) throws UMS_CourseAddingError{

	        if(!(course instanceof GradCourseData)){
	            System.out.println("instanceof hata!!");
	            throw new UMS_CourseAddingError("GradStudent","GradCourseData");
	           
	        }

	        boolean check = true;


	        CourseData[] new_taken_courses = new CourseData[getTaken_courses().length+1];

	        for (int i = 0; i < getTaken_courses().length; i++) {
	            if(getTaken_courses()[i].getName() == course.getName())
	                check = false;
	            new_taken_courses[i] = getTaken_courses()[i];
	        }


	        new_taken_courses[getTaken_courses().length] = course;

	        setTaken_courses(check ? new_taken_courses : getTaken_courses());

	    }
	public int getPassedCredit() {
		return 0;
	} 

}
