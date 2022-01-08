package labweeknine;

public class Assignment {
private String info;

public Assignment(String info) {
	super();
	this.info = info;
}

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}
public void print() {
	System.out.println("Type of the assignment: "+ this.getClass()+ ", Info: "+ this.getInfo());
}
}
