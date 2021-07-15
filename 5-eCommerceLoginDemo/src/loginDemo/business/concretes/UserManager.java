package loginDemo.business.concretes;


import loginDemo.business.abstracts.UserCheckService;
import loginDemo.business.abstracts.UserService;
import loginDemo.dataAccess.abstracts.UserDao;
import loginDemo.entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	private UserCheckService userCheckService;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService) {
		this.userDao = userDao;
		this.userCheckService = userCheckService;
	}

	@Override
	public void signUp(User user) {
		if (mailIsExist(user) && userCheckService.userIsValid(user)) {
			userDao.add(user);			
		}else {
			System.out.println("Failed registration");
		}

		
		
	}

	@Override
	public void signIn(User user) {
		if (user.getEmail() != "" && user.getPassword() != "") {
			System.out.println("Successful login : " + user.getFirstName());
		}else {
			System.out.println("Try again");
		}
		
	}

	@Override
	public void userVerify(User user) {
		System.out.println("Your account has been activated : " + user.getEmail() );
		
	}
	
	private boolean mailIsExist(User user) {
		for (User userr : userDao.getAllUsers()) {
			if (user.getEmail() == userr.getEmail()) {
				System.out.println("Your e-mail is registered to the system.");
				return false;
			}
		}
		
		return true;
	}

	@Override
	public void sendMail(User user) {
		System.out.println("Click the link to confirm your mail :" + user.getEmail());
		
	}
	
}
