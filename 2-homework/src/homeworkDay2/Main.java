package homeworkDay2;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(101, "Gurkan", "Yakar", "data.yakar@gmail.com", "123", "Male");
		User user2 = new User(102, "Engin", "Demirog", "engindemirog@gmail.com", "12345", "Male");
		User user3 = new User(103, "Eylül", "Yýlmaz", "eylulyilmaz@gmail.com", "123456789", "Female");
		
		Course course1 = new Course(1, "Java Course", "Java & React", "Programming", "Programming technologies are all based on the same foundation. You will learn this at camp.", "Mustafa Murat Coþkun");
		Course course2 = new Course(2, "C# Course", "C# & Angular", "Programming", "Programming technologies are all based on the same foundation. You will learn this at camp.", "Engin Demirog");
		
		User[] users = {user1, user2, user3};
		Course[] courses = {course1, course2};
		
		for (User user : users) {
			System.out.println(user.firstName + "\t" + user.lastName + "\t" + user.email);
		}
		
		System.out.println("------------------------------------------------------------");
		
		for (Course course : courses) {
			System.out.println(course.courseName + "\t" + course.courseCategory + "\t" + course.courseInstructor);
		}
		
		System.out.println("------------------------------------------------------------");
		
		UserManager manager = new UserManager();
		manager.update(user1);
		manager.delete(user3);
	}

}
