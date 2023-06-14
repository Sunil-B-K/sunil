package loginpage;

import guvi.dbhandler.Validate;

public class Vail {
	public static boolean validateData(String ema,String pas) {
		String dbpass=Validate.fetchData(ema);
		if(pas.equals(dbpass)) {
			return true;
		}
		else {
			return false;
		}
}
}