package loginDemo.business.abstracts;

import loginDemo.entities.concretes.User;

public interface UserCheckService {
	boolean userIsValid(User user);
}
