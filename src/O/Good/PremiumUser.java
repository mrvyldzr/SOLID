package O.Good;






public class PremiumUser extends User {

	public PremiumUser(String name, String username, String password) {
		super(name, username, password);
		// TODO Auto-generated constructor stub
	}
		
	@Override
	public double subscriptionPrice(int years) {
		return super.subscriptionPrice(years) * 2;
	}

}