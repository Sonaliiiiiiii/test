package usermaster;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class user_master {
	public WebDriver d;
	public void User() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\1003649\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		d = new ChromeDriver(option);
		d.get("http://155.248.242.125:8090/");
		d.manage().window().maximize();
	}

}
