package homeworkDay3;

public class Main {
	public static void main(String[] args) {

		
		Instructor enginDemirog = new Instructor(1, "Engin", "Demirog", 32, 'M',"Programming");
		User gurkanYakar = new User(2, "Gürkan", "Yakar", 23, 'M');
		Student furkanYakar = new Student(3, "Furkan", "Yakar", 18, 'M', "Istanbul University");
		
		//user operations
		UserManager userManager = new UserManager();
		userManager.register(gurkanYakar);
		userManager.logIn(gurkanYakar);
		userManager.logOut(gurkanYakar);
		userManager.logIn(gurkanYakar);
		userManager.updateProfile(gurkanYakar);
		userManager.getProfileInformation(gurkanYakar);
		System.out.println();
		System.out.println("----------------------------------------------------");
		//student operations
		StudentManager studentManager = new StudentManager();
		studentManager.register(furkanYakar);
		studentManager.logIn(furkanYakar);
		studentManager.logOut(furkanYakar);
		studentManager.logIn(furkanYakar);
		studentManager.updateProfile(furkanYakar);
		studentManager.getProfileInformation(furkanYakar);
		System.out.println();
		System.out.println("----------------------------------------------------");
		//instructor operations
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.register(enginDemirog);
		instructorManager.logIn(enginDemirog);
		instructorManager.logOut(enginDemirog);
		instructorManager.logIn(enginDemirog);
		instructorManager.updateProfile(enginDemirog);
		instructorManager.getProfileInformation(enginDemirog);
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		userManager.deleteProfile(gurkanYakar);
		studentManager.deleteProfile(furkanYakar);
		instructorManager.deleteProfile(enginDemirog);
		
	}
}
