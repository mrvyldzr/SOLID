package L.Good;

import java.util.ArrayList;
import java.util.List;


public class Admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<IUser> users = new ArrayList<IUser>(); 
		users.add(new StudentUser("Merve", "Yýldýzer", "123"));
		users.add(new PremiumUser("Ozge", "Yýlmaz", "1245"));
		users.add(new CompanyUser("Ayse", "Yýlmaz", "123456"));
		
			for(IUser u: users) {
				//compilation error
				((StudentUser) u).subscriptionPrice(2);
		}
	}

}