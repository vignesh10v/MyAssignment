package week1day2;


public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("browser  Launched Successfully");
		return browserName;
		
	}
	public void loadUrl() {
		// TODO Auto-generated method stub
		System.out.println("Application url loaded successfully");

	}

	public static void main(String[] args) {
		Browser b = new Browser();
		System.out.println(b.launchBrowser("chrome"));
		b.loadUrl();
		}

}
	
