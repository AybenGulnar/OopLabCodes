package labweeknine;

public class UMSException extends Exception {
	
	AdministrativeStaff responsible;

	public UMSException() {
	
	}
	
	public UMSException(AdministrativeStaff responsible) {
		this.responsible = responsible;
	}

	public AdministrativeStaff getResponsible() {
		return responsible;
	}

	public void setResponsible(AdministrativeStaff responsible) {
		this.responsible = responsible;
	}


}
