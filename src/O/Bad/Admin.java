package O.Bad;
import O.extra.FileStorage;



import java.util.ArrayList;
import java.util.List;



public class Admin {
	
	List<User> listOfStandard = new ArrayList<User>();
	List<User> listOfPremium = new ArrayList<User>();
	
	FileStorage fs = new FileStorage();

	public void addAUser(User u, String typeOfUser) {
		if(typeOfUser.equals("student")) {
			addStandardUser(u);
			fs.wrtieToFile(u.toString(), typeOfUser);
		} else {
			addPremiumUser(u);
			fs.wrtieToFile(u.toString(), typeOfUser);
		}
	}
	
	public void addStandardUser(User u) {
		listOfStandard.add(u);
	}
	
	public void addPremiumUser(User u) {
		listOfPremium.add(u);
	}
}