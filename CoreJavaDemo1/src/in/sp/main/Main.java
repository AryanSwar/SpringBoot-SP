package in.sp.main;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
        Student stdObj = new Student();

        stdObj.setName("Aryan");
        stdObj.setRollno(101);

        stdObj.display();
    }
}
