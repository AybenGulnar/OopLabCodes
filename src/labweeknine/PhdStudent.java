package labweeknine;
public class PhdStudent extends GradStudent{

	

	  public PhdStudent(Person person, int enrollment_year, String student_number, CourseData[] taken_courses) {
		super(person, enrollment_year, student_number, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public PhdStudent(Person person, int enrollment_year, String student_number) {
		super(person, enrollment_year, student_number);
		// TODO Auto-generated constructor stub
	}

	public PhdStudent(String name, String identity_no, String student_number, int enrollment_year,
			CourseData[] taken_courses) {
		super(name, identity_no, student_number, enrollment_year, taken_courses);
		// TODO Auto-generated constructor stub
	}

	public PhdStudent(String name, String identity_no, String student_number, int enrollment_year) {
		super(name, identity_no, student_number, enrollment_year);
		// TODO Auto-generated constructor stub
	}

	public boolean check_graduation(){

	        CourseData zorunlu_ders = new GradCourseData("ceng101","zorunlu ders",10);

	        boolean check = false;

	        for (int i = 0; i < getTaken_courses().length; i++) {
	            if(getTaken_courses()[i].getName() == zorunlu_ders.getName()){
	                check = true;
	                System.out.println("zorunlu ders alınmıştır");
	            }
	        }

	        if(total_credit() >= 100 && check){  System.out.println("kredi şartı sağlanmıştır.");
	            return true;
	        }
           

	        return false;
	    }
	public int getPassedCredit() {
		return 0;
	} 
	
	}


