package labweeknine;

public class CourseData {
   


	public String code;
    public String name;
    public String grade;
	public int credit;
    private TeachingStaff instructor_data;
    
    public CourseData(String code, String name, TeachingStaff instructor_data) {
		super();
		this.code = code;
		this.name = name;
		this.instructor_data = instructor_data;
	}



	private TeachingAssistant[] assistant_data;
    
    public CourseData(String code, String name, String grade, int credit, TeachingStaff instructor_data,
			TeachingAssistant[] assistant_data) {
		super();
		this.code = code;
		this.name = name;
		this.grade = grade;
		this.credit = credit;
		this.instructor_data = instructor_data;
		this.assistant_data = assistant_data;
	}

    
    
    public CourseData(String code, String name, String grade, TeachingStaff instructor_data) {
  		super();
  		this.code = code;
  		this.name = name;
  		this.grade = grade;
  		this.instructor_data = instructor_data;
  	}




    public CourseData(String code, String name, int credit) {
		super();
		this.code = code;
		this.name = name;
		this.credit = credit;
	}

	public CourseData(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
        return code;
    }

    public void setCode(String newcode) {
        this.code = newcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }



	public TeachingStaff getInstructor_data() {
		return instructor_data;
	}



	public TeachingAssistant[] getAssistant_data() {
		return assistant_data;
	}



	public void setInstructor_data(TeachingStaff instructor_data) {
		this.instructor_data = instructor_data;
	}



	public void setAssistant_data(TeachingAssistant[] assistant_data) {
		this.assistant_data = assistant_data;
	}

public boolean isPassed() {
	return false;
}
public void AddAssistant (TeachingAssistant ta) {
	
}
   
}

