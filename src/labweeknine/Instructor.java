package labweeknine;

public class Instructor extends Employee{

private CourseData[] given_courses = {}; 


public Instructor(String identity_no, String name, String registry_number, float salary) {
	super(identity_no, name, registry_number, salary);
	
}


public CourseData[] getGiven_courses() {
	return given_courses;
}


public void setGiven_courses(CourseData[] given_courses) {
	this.given_courses = given_courses;
}

public void AddCourse(CourseData course) {
	boolean check = true;
	
	CourseData[] temp = new CourseData[given_courses.length+1];
	
	for (int i = 0; i < given_courses.length; i++) {
		temp[i] = given_courses[i];
	}

    temp[given_courses.length] = course;

    given_courses = check ? temp : given_courses;
	
}


public boolean EarnedHisSalary(CourseData[] courses) {
	
	int gradLecture = 0;
    int underGradLecture = 0;
    int creditSum = 0;
    for (int i = 0; i < courses.length; i++) {
        if (courses[i] instanceof UnderGradCourseData) {
            underGradLecture++;
        }
        if (courses[i] instanceof GradCourseData) {
            gradLecture++;
        }
        creditSum+=courses[i].getCredit();
    }

    if (creditSum >= 12 && gradLecture > 0 && underGradLecture > 0 ) {
        return true;
    }

    return false;


 
}

}

