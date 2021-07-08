package homeworkDay3;

public class UserManager{
	public void register(User user) {
		System.out.println(user.getFirstName() + "\t" + user.getLastName()+"\thas succesfully registered.");
	}
	public void updateProfile(User user) {
		System.out.println(user.getFirstName() + "\t" + user.getLastName()+"\thas succesfully updated.");
	}
	
	public void deleteProfile(User user) {
		System.out.println(user.getFirstName() + "\t" + user.getLastName()+"\thas succesfully deleted.");
	}
	
	public void logIn(User user) {
		System.out.println(user.getFirstName() + "\t" + user.getLastName()+"\tlogged into the system.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getFirstName() + "\t" + user.getLastName()+"\tlogged out the system.");
	}
	
	public void getProfileInformation(User user) {
		System.out.print("First Name : " + user.getFirstName()
		+ "\t" + "Last Name : " + user.getLastName()
		+ "\t" + "Age : " +user.getAge()
		+ "\t" + "Gender : " + user.getGender());
	}
}
