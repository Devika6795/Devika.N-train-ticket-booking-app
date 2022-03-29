
package UserRegistration;

import com.UserRegistration.UserRegistration;

public class UserRegistrationValidation {
	public static boolean userRegistrationValidation(UserRegistration ur) {
		boolean isValid = true;
		if(ur.userName.isEmpty())
		{
			System.out.println("Invalid User Name");
			isValid = false;
		}
	    if(ur.emailId.isEmpty()||(!ur.emailId.contains("@gmail.com")))
		{
			System.out.println("Invalid EmailId");
			isValid = false;
			
		}
		if(ur.password.isEmpty()||(!(ur.password.length()>=8)))
		{
			System.out.println("Invalid Password");
			isValid = false;
		}
		if(ur.phoneNumber.isEmpty()||(!(ur.phoneNumber.length()==10)))
		{
			System.out.println("Invalid PhoneNumber");
			isValid = false;
		}
		
		return isValid;
	}
}