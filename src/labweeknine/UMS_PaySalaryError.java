package labweeknine;

import java.util.ArrayList;

public class UMS_PaySalaryError extends UMSException{

	private Academics academic;
	private ArrayList<String> causes = new ArrayList<String>();
	
	public UMS_PaySalaryError(Academics academic) {
		super();
		this.academic = academic;

	}

	public UMS_PaySalaryError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UMS_PaySalaryError(AdministrativeStaff responsible) {
		super(responsible);
		// TODO Auto-generated constructor stub
	}

	public Academics getAcademic() {
		return academic;
	}

	public ArrayList<String> getCauses() {
		return causes;
	}

	public void setAcademic(Academics academic) {
		this.academic = academic;
	}

	public void setCauses(ArrayList<String> causes) {
		this.causes = causes;
	}
	
}
