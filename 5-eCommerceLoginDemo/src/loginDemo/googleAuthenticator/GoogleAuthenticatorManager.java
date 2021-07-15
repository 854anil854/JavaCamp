package loginDemo.googleAuthenticator;

public class GoogleAuthenticatorManager {
	public void register(String email, String password) {
		System.out.println("Your account has been successfully created with google : " + email);
	}
	
	public void login(String email, String password) {
		System.out.println("You are logged with google : " + email);
	}
}
