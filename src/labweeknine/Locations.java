package labweeknine;

public abstract class Locations {

private String Identifier;
private String Adress;
private double Size = -0.1;

public Locations(String identifier, String adress, double size) {
	super();
	Identifier = identifier;
	Adress = adress;
	Size = size;
}

public String getIdentifier() {
	return Identifier;
}

public String getAdress() {
	return Adress;
}

public int getSize() {
	return (int) Size;
}

public void setIdentifier(String identifier) {
	Identifier = identifier;
}

public void setAdress(String adress) {
	Adress = adress;
}

public void setSize(double size) {
	Size = size;
}
public abstract boolean isProperlyMaintaned();
	

}
