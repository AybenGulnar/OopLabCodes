package labweeknine;

public class Hallway extends Locations{

	public Hallway(String identifier, String adress, double size) {
		super(identifier, adress, size);
		// TODO Auto-generated constructor stub
	}
	public void clean() {
		
	}
	
	@Override
	public boolean isProperlyMaintaned() {
		return false;
	}
	
}
