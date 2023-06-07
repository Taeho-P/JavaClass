package super_2023_05_25;

public class Student extends People {
	public int studentNo;
	
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
