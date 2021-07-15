package loginDemo.core;

import loginDemo.googleAuthenticator.GoogleAuthenticatorManager;

public class GoogleAuthenticatorManagerAdapter implements LoginService {

	@Override
	public void register(int id, String email, String password, String firstName, String lastName) {
		GoogleAuthenticatorManager googleAuthenticatorManager = new GoogleAuthenticatorManager();
		googleAuthenticatorManager.register(email, password);
		
	}

	@Override
	public void login(String email, String password) {
		GoogleAuthenticatorManager googleAuthenticatorManager = new GoogleAuthenticatorManager();
		googleAuthenticatorManager.login(email, password);
		
	}




}
