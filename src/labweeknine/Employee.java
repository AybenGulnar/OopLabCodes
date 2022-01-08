package labweeknine;


public class Employee extends Person{

	private String registry_number;
	private float salary = -0.1f;
	
	public Employee(String identity_no, String name, String registry_number, float salary ) {
		super(identity_no, name);
		this.registry_number=registry_number;
		this.salary= salary;
				
				// TODO Auto-generated constructor stub
	}

	public Employee(Person person, String registry_number, float salary)
	{
		super(person, registry_number, salary);
		
	}
	public String getRegistry_number() {
		return registry_number;
	}

	public double getSalary() {
		return salary;
	}

	public void setRegistry_number(String registry_number) {
		this.registry_number = registry_number;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public boolean EarnedHisSalary() {
		return false;
	}
	
	//instructur en az 4 ders 12 kredi 
	//biri graduate biri undergraduate 
	//caretaker : en az 3 sýnýf ve toplam büyüklüðü 100 metrekare üstünde olacak 

}

