package labweeknine;


public class UnderGradStudent extends Student {


	 public UnderGradStudent(Person person, int enrollment_year, String student_number, CourseData[] taken_courses) {
		super(person, enrollment_year, student_number, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public UnderGradStudent(Person person, int enrollment_year, String student_number) {
		super(person, enrollment_year, student_number);
		// TODO Auto-generated constructor stub
	}

	public UnderGradStudent(String name, String identity_no, String student_number, int enrollment_year,
			CourseData[] taken_courses) {
		super(name, identity_no, student_number, enrollment_year, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public UnderGradStudent(String name, String identity_no, String student_number, int enrollment_year) {
		super(name, identity_no, student_number, enrollment_year);
		// TODO Auto-generated constructor stub
	}

	public void addCourse(CourseData course) throws UMS_CourseAddingError{

	        if(!(course instanceof UnderGradCourseData)){
	            System.out.println("instanceof hata!!");
	           throw new UMS_CourseAddingError("GradStudent","GradCourseData");
	        }

	        boolean check = true;


	        CourseData[] temp = new CourseData[getTaken_courses().length+1];

	        for (int i = 0; i < getTaken_courses().length; i++) {
	            if(getTaken_courses()[i].getName() == course.getName())
	                check = false;
	            temp[i] = getTaken_courses()[i];
	        }


	        temp[getTaken_courses().length] = course;

	        setTaken_courses(check ? temp : getTaken_courses());

	    }

	    public boolean check_graduation(){

	        if(total_credit() >= 100){
	            return true;
	        }
	        return false;
	    }
	    public int getPassedCredit() {
			return 0;
		} 
}
