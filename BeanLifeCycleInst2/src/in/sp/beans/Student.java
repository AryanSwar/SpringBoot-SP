package in.sp.beans;

public class Student {
	private String name;
	private int rollno;
	
	public Student(int a) {
		System.out.println("constructor invoked");
	}
	
	public String getName() {
		System.out.println("name getter method invoked");
		return name;
	}
	public void setName(String name) {
		System.out.println("name setter method invoked");
		this.name = name;
	}
	public int getRollno() {
		System.out.println("rollno getter method invoked");
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("rollno setter method invoked");
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("method invoked");
//		System.out.println("Name : "+name);
//		System.out.println("Rollno : "+rollno);
	}
	
	public static Student createStdObj() {
		System.out.println("static factory method invoked");
		return new Student(10);
	}
}
