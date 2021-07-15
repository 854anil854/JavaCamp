package loginDemo;

import loginDemo.business.abstracts.UserService;
import loginDemo.business.concretes.UserCheckManager;
import loginDemo.business.concretes.UserManager;
import loginDemo.core.GoogleAuthenticatorManagerAdapter;
import loginDemo.core.LoginService;
import loginDemo.dataAccess.concretes.HibernateUserDao;
import loginDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Gurkan", "Yakar", "data.yakar@gmail.com", "123456");
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager());
		userService.signUp(user);
		userService.sendMail(user);
		userService.userVerify(user);
		userService.signIn(user);

		
		System.out.println("-------------------------------------------------------------------------");
		LoginService loginService = new GoogleAuthenticatorManagerAdapter();
		loginService.register(2, "data.yakar@gmail.com", "123456", "Gurkan", "Yakar");
		loginService.login("data.yakar@gmail.com", "123456");
		
	}

}
