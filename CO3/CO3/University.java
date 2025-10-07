// University Management System


//abstract class implementation
abstract class Person{
	private String name;
	private String id;
	
	public Person(String name, String id){
		this.name = name;
		this.id   = id;
	 }
	
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getId(){
		return id;
	}

	public void getId(String id){
		this.id = id;
	}
	
	// abstract method
	public abstract String getRole();
	
	public	void displayDetails(){
		System.out.println("Name : " +this.name);
		System.out.println("ID : " +this.id);
		System.out.println("Role : " +getRole());
	}
}


class Student extends Person{
	 public Student(String name, String id){
		// using super() 
		super(name, id);
	  }
	
	public String getRole(){
		return "Student";
	}
}


class Professor extends Person{
	public Professor(String name, String id){
		super(name,id);
	 }

	public String getRole(){
		return "Professor";
	}
}


public class University{
	public static void main(String[] args){
		// call parent class and get child behaviour
		Person s1 = new Student("Sonat","S101");
		Person p1 = new Professor("Aleena","P101");
		s1.displayDetails();
		p1.displayDetails();
	}
}