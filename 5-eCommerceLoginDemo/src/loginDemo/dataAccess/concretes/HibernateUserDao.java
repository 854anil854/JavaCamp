package loginDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import loginDemo.dataAccess.abstracts.UserDao;
import loginDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("User added with hibernate : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println("User deleted with hibernate : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public User getUser(int id) {
		User getUser = null;
		for (User user : users) {
			if (user.getId() == id) {
				getUser = new User();
				getUser = user;
			}
		}
		return getUser;
	}

}
