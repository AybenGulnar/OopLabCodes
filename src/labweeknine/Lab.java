package labweeknine;

public class Lab extends Locations{

	public Lab(String identifier, String adress, double size) {
		super(identifier, adress, size);
		// TODO Auto-generated constructor stub
	}
	
	public void checkComputers() {
		
	}
	@Override
	public boolean isProperlyMaintaned() {
		return false;
	}

}
