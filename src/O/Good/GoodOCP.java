package O.Good;

import O.Bad.Admin;
import O.Bad.User;

public class GoodOCP {
	
		public static void main(String[] args) {
			User u = new User("Merve", "Yýldýzer", "1234");
			Admin a = new Admin();
			a.addAUser(u, "standard");
		
	}
}