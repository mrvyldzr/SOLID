package S.bad;

public class BadSRP {
	public static void main(String[] args) {
		User u = new User("Merve", "Yýldýzer", "1234");
		Admin a = new Admin();
		a.addAUser(u);
	}
}
