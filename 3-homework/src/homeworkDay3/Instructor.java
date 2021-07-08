package homeworkDay3;

public class Instructor extends User {

	private String profession;
	
	public Instructor(int id, String firstName, String lastName, int age, char gender, String profession) {
		super(id, firstName, lastName, age, gender);
		this.profession = profession;
	}
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	

}
