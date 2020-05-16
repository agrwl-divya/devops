import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SUPER123\\Desktop\\All-resume\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		// TODO Auto-generated method stub
		
		d.get("https://mvnrepository.com/");
	}

}
