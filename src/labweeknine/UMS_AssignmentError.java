package labweeknine;

public class UMS_AssignmentError extends UMSException {

private String assignment_type;
private Academics academic;


public UMS_AssignmentError(String assignment_type, Academics academic) {
	super();
	this.assignment_type = assignment_type;
	this.academic = academic;
}


public UMS_AssignmentError() {
	super();
	// TODO Auto-generated constructor stub
}


public UMS_AssignmentError(AdministrativeStaff responsible,String assignment_type, Academics academic) {
	super(responsible);
	this.assignment_type = assignment_type;
	this.academic = academic;
	// TODO Auto-generated constructor stub
}


public String getAssignment_type() {
	return assignment_type;
}


public Academics getAcademic() {
	return academic;
}


public void setAssignment_type(String assignment_type) {
	this.assignment_type = assignment_type;
}


public void setAcademic(Academics academic) {
	this.academic = academic;
}


	
}
