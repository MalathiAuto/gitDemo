package arun;

public class Tools {


		
		import java.util.concurrent.TimeUnit; 
		import org.openqa.selenium.WebDriver; 
		import org.openqa.selenium.firefox.FirefoxDriver; 

	
		{
		 // To execute any program we need a main() method. So we will continue from the main method. 
		  public static void main(String[] args) 
		  { 
		// First create an object of FirefoxDriver class using WebDriver reference variable. 
		// Since WebDriver is an interface and Firefox driver is a class that implements all the methods of the web driver interface.
		    WebDriver driver = new FirefoxDriver(); // FirefoxDriver class with no parameters. i.e It will launch default Firefox by Java program. Default Firefox profile is similar to launching the firefox in safe mode. 

		// Declaration of variable URL with datatype String and store the URL of the webpage. 
		   String URL = "https://www.google.co.in";

		// Now call get() command to open the URL of the webpage. 
		   driver.get(URL); // It takes String URL as a parameter and returns nothing. 

		// Wait For Page To Load.
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 

		// Print a message to display on the console that the website is opened successfully. 
		   System.out.println("Website is opened successfully"); 

		// Call the close() method using reference variable 'driver' to close the browser. 
		    driver.close(); 
		  } 
		}

	}

}
