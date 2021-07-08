package homeworkDay3;

public class StudentManager extends UserManager{
	@Override
	public void register(User user) {
		System.out.print(user.getFirstName() + "\t" + user.getLastName()+"\thas succesfully registered as a student.");
	}
	
	public void getProfileInformation(Student student) {
		super.getProfileInformation(student);
		System.out.print("\tSchool : " + student.getSchoolName());
	}
}
