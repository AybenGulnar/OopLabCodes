package labweeknine;

public class LectureHall extends Locations{
	
public LectureHall(String identifier, String adress, double size, String id, String location, int size2) {
		super(identifier, adress, size);
		Id = id;
		this.location = location;
		size = size2;
	}

private String Id;
private String location; //adres
private int size; //boyut

//public LectureHall(String id, String location, int size) {
//
//	Id = id;
//	this.location = location;
//	this.size = size;
//}

public String getId() {
	return Id;
}

public LectureHall(String identifier, String adress, double size) {
	super(identifier, adress, size);
	// TODO Auto-generated constructor stub
}

public String getLocation() {
	return location;
}

public int getSize() {
	return size;
}

public void setId(String id) {
	Id = id;
}

public void setLocation(String location) {
	this.location = location;
}

public void setSize(int size) {
	this.size = size;
}

@Override
public boolean isProperlyMaintaned() {
	// TODO Auto-generated method stub
	return false;
}

}
