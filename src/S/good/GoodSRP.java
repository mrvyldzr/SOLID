package S.good;

public class GoodSRP {
	public static void main(String[] args) {
		User u = new User("Merve", "Y�ld�zer", "1234");
		Admin a = new Admin();
		a.addAUser(u);
	}
}