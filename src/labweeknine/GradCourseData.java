package labweeknine;



public class GradCourseData extends CourseData{

	public GradCourseData(String code, String name, TeachingStaff instructor_data) {
		super(code, name, instructor_data);
		// TODO Auto-generated constructor stub
	}

	public GradCourseData(String code, String name, int credit) {
		super(code, name, credit);
		// TODO Auto-generated constructor stub
	}
	public boolean isPassed() {
		return false;
	}

}
