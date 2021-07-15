package loginDemo.business.abstracts;

import loginDemo.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
	void userVerify(User user);
	void sendMail(User user);
}
