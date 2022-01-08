package labweeknine;

public class LabTechnitian extends TechStaff {


	private Lab[] labs;
	
	public LabTechnitian(Person person, String registry_number, float salary,Lab[] labs) {
		super(person, registry_number, salary);
		this.labs = labs;
	}
	

	public LabTechnitian(String identity_no, String name, String registry_number, float salary, Lab[] labs) {
		super(identity_no, name, registry_number, salary);
		this.labs = labs;
	}


	public Lab[] getLabs() {
		return labs;
	}


	public void setLabs(Lab[] labs) {
		this.labs = labs;
	}

	
public void AddLab(Lab lab) {
	
}
public boolean EarnedHisSalary() {
	return false;
}
}
