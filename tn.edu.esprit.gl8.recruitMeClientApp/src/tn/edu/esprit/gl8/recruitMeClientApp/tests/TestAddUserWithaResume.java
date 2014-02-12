package tn.edu.esprit.gl8.recruitMeClientApp.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.gl8.recruitMe.domain.User;
import tn.edu.esprit.gl8.recruitMe.services.interfaces.UserServicesRemote;

public class TestAddUserWithaResume {

	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			
			UserServicesRemote userServicesRemote = (UserServicesRemote) context.lookup("ejb:/tn.edu.esprit.gl8.recruitMe/UserServices!tn.edu.esprit.gl8.recruitMe.services.interfaces.UserServicesRemote");
			User user = new User("sofien", "test");
			userServicesRemote.addUser(user);
			
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
