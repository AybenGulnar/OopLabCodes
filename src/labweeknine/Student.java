package labweeknine;

public class Student extends Person {
	private String student_number;
	private int enrollment_year;
	private CourseData[] taken_courses = {};
	
	public Student(String name, String identity_no, String student_number, int enrollment_year) {
		super(identity_no, name);
		this.student_number = student_number;
		this.enrollment_year = enrollment_year;
	}
	
	public Student(String name, String identity_no, String student_number, int enrollment_year, CourseData[] taken_courses) {
		super(identity_no, name);
		this.student_number = student_number;
		this.enrollment_year = enrollment_year;
		this.taken_courses = taken_courses;
	}
	
	public Student(Person person,int enrollment_year,String student_number) {
		super(person);
		// TODO Auto-generated constructor stub
		this.student_number = student_number;
		this.enrollment_year = enrollment_year;
	}


	public Student(Person person,int enrollment_year,String student_number,CourseData[] taken_courses ) {
		super(person);
		// TODO Auto-generated constructor stub
		this.student_number = student_number;
		this.enrollment_year = enrollment_year;
		this.taken_courses= taken_courses;

	}
	
	public String getStudent_number() {
		return student_number;
	}

	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}


	public int getEnrollment_year() {
		return enrollment_year;
	}

	public void setEnrollment_year(int enrollment_year) {
		this.enrollment_year = enrollment_year;
	}

	public CourseData[] getTaken_courses() {
		return taken_courses;
	}

	public void setTaken_courses(CourseData[] taken_courses) {
		this.taken_courses = taken_courses;
	}
	
	public void addCourse(CourseData course) throws UMS_CourseAddingError {
		
		boolean check = true;
		
		CourseData[] temp = new CourseData[taken_courses.length+1];
		
		for (int i = 0; i < taken_courses.length; i++) {
			temp[i] = taken_courses[i];
		}

        temp[taken_courses.length] = course;

        taken_courses = check ? temp : taken_courses;
		

	}
	
	public boolean checkCourse(String course_code) {
		
		for (int i = 0; i < taken_courses.length; i++) {
			if(taken_courses[i].getCode() == course_code) {
				System.out.println("True");
				return true;
			}
		}
		System.out.println("False");
		return false;
	}
	
	
	public void setCourseGrade(String course_name, String course_grade) {
		
		 for (int i = 0; i < taken_courses.length; i++) {
			if (taken_courses[i].name == course_name) 
				taken_courses[i].setGrade(course_grade);
			else  
				System.out.println("Alınan dersler arasında böyle bir ders bulunmamaktadır.");
		}
	}
	

	public double getGDA() {
		double total = 0;
		int creditSum = 0;
		
		for (int i = 0; i < taken_courses.length; i++) {
			creditSum += taken_courses[i].getCredit();
		}
		
		for (int i = 0; i < taken_courses.length; i++) {
			total += Double.parseDouble(taken_courses[i].getGrade())*taken_courses[i].getCredit();
		}
		
		return total / creditSum;
		
	}
	
	 public int total_credit(){
		 
	        int toplam_credit = 0;
	        for (int i = 0; i < taken_courses.length; i++) {
	            toplam_credit += taken_courses[i].getCredit();
	        }

	        return toplam_credit;
	    }

	    public boolean check_graduation(){
	        return false;
	    }
	public int getPassedCredit() {
		return 0;
	} 
	
}