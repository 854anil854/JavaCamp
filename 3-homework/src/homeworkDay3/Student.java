package homeworkDay3;

public class Student extends User{
	private String schoolName;
	
	public Student(int id, String firstName, String lastName, int age, char gender, String schoolName) {
		super(id, firstName, lastName, age, gender);
		this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	
	
	

}
