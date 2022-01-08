package labweeknine;

public class Caretaker extends MaintanenceStaff{

	public Caretaker(Person person, String registry_number, float salary) {
		super(person, registry_number, salary);
		// TODO Auto-generated constructor stub
	}


	public Caretaker(Person person, String registry_number, float salary, Locations[] responsibilit_array) {
		super(person, registry_number, salary, responsibilit_array);
		// TODO Auto-generated constructor stub
	}

	public Caretaker(String identity_no, String name, String registry_number, float salary, CourseData[] courses) {
		super(identity_no, name, registry_number, salary, courses);
		// TODO Auto-generated constructor stub
	}

	public Caretaker(String identity_no, String name, String registry_number, float salary) {
		super(identity_no, name, registry_number, salary);
		// TODO Auto-generated constructor stub
	}


	private LectureHall[] classrooms = {}; 
	
	public LectureHall[] getClassrooms() {
		return classrooms;
	}

//	public void setClassrooms(LectureHall[] classrooms) {
//		this.classrooms = classrooms;
//	}
//
//	public Caretaker(String identity_no, String name, String registry_number, float salary) {
//		super(identity_no, name, registry_number, salary);
//		// TODO Auto-generated constructor stub
//	}
	
	public void AddClassroom(LectureHall classroom) {
	boolean check = true;
		
	LectureHall[] temp = new LectureHall[classrooms.length+1];
		
		for (int i = 0; i < classrooms.length; i++) {
			temp[i] = classrooms[i];
		}

        temp[classrooms.length] = classroom;

        classrooms = check ? temp : classrooms;
		

	}
	

	public boolean EarnedHisSalary( LectureHall[] classrooms ) {

		int sum=0;
	        if(classrooms.length<3) {
	        	return false;
	        	
	            }
	        
	        else {
	        for (int i = 0; i < classrooms.length; i++) {
				sum += classrooms[i].getSize();
				
			}
	        
	        if (sum <=100) {
				return false;
			}
	        
	   }
		
		return true;
	}
public void AddResponsibility(Locations[] location) {
		
	}
public boolean EarnedHisSalary() {
	return false;
}
	
//temizlikten sorumlu lecture hall tipinde 
}
