package loginDemo.dataAccess.abstracts;

import java.util.List;

import loginDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	List<User> getAllUsers();
	User getUser(int id);
}
