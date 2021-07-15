package loginDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import loginDemo.business.abstracts.UserCheckService;
import loginDemo.dataAccess.abstracts.UserDao;
import loginDemo.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	Matcher matcher;


	@Override
	public boolean userIsValid(User user) {
		if (checkInfos(user) && emailCheck(user) && firstNameCheck(user) && lastNameCheck(user) && passwordCheck(user)) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean emailCheck(User user) {
		matcher = Pattern.compile("^[a-zA-z][.\\w\\d]{2,}@(gmail|hotmail)(.com)$").matcher(user.getEmail());
		 if (!matcher.find()) {
			 System.out.println("email must be like gurkan.34@gmail.com");
             return false;
         }else{
        	 //System.out.println("valid email");
        	 return true;
         }
	}
	
	private boolean passwordCheck(User user) {
		matcher = Pattern.compile("^[a-z0-9_-]{6,18}$").matcher(user.getPassword());
		 if (!matcher.find()) {
			 System.out.println("Password must be like myp4ssw0rd");
			 return false;
        }else{
       	 	//System.out.println("valid password");
       	 	return true;
        }
	}
	
	private boolean checkInfos(User user) {
		if (user.getFirstName() != "" && user.getLastName() != "" && user.getEmail() != "" && user.getPassword() != "") {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	private boolean firstNameCheck(User user) {
		matcher = Pattern.compile("\\w{2,}$").matcher(user.getFirstName());
		 if (!matcher.find()) {
			 System.out.println("Name must be least 2 charachters");
			 return false;
        }else{
       	 	//System.out.println("valid name");
       	 	return true;
        }
	}
	
	private boolean lastNameCheck(User user) {
		matcher = Pattern.compile("^\\w{2,}$").matcher(user.getLastName());
		 if (!matcher.find()) {
			 System.out.println("Last name must be least 2 charachters");
			 return false;
        }else{
       	 	//System.out.println("valid last name");
       	 	return true;
        }
	}
	




}
