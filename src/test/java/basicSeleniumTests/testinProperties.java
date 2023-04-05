package basicSeleniumTests;

public class testinProperties {

	public static void main(String[] args) {
		
		String OperatingSystem = System.getProperty("os.name");
		
		if(OperatingSystem.equals("Mac OS X")) {
				//url or the mac
		}else {
				//url for the window
		}
	}
	
	// this way weather you use mac or window with the same framework wouldn't be a problem
}
