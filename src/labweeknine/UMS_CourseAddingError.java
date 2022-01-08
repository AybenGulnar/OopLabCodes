package labweeknine;

public class UMS_CourseAddingError extends UMSException {
 private String Student_type;
 private String course_type;
 
public UMS_CourseAddingError() {
	super();
	// TODO Auto-generated constructor stub
}

public UMS_CourseAddingError(AdministrativeStaff responsible) {
	super(responsible);
	// TODO Auto-generated constructor stub
}

public UMS_CourseAddingError(String student_type, String course_type) {
	super();
	Student_type = student_type;
	this.course_type = course_type;
}

public String getStudent_type() {
	return Student_type;
}

public String getCourse_type() {
	return course_type;
}

public void setStudent_type(String student_type) {
	Student_type = student_type;
}

public void setCourse_type(String course_type) {
	this.course_type = course_type;
}
  
}
