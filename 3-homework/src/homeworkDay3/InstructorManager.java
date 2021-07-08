package homeworkDay3;

public class InstructorManager extends UserManager{
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + "\t" + user.getLastName()+"\thas succesfully registered as a instructor.");
	}
	
	public void getProfileInformation(Instructor instructor) {
		super.getProfileInformation(instructor);
		System.out.print("\tProfession : " + instructor.getProfession());
	}
}
