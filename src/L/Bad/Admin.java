package L.Bad;

import java.util.ArrayList;
import java.util.List;

public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>(); 
		users.add(new StudentUser("merve", "y�ld�zer", "password"));
		users.add(new PremiumUser("ayse", "yilmaz", "1234"));
		users.add(new CompanyUser("ozge", "y�lmaz", "helloworld"));
		
	/*	for(User u: users) {
			// Runtime user
			u.subscriptionPrice(2);
		}*/
	}

}