package O.Bad;

	public class BadOCP {
		public static void main(String[] args) {
			User u = new User("Merve", "Y�ld�zer", "1234");
			Admin a = new Admin();
			a.addAUser(u, "standard");
		}
	}

