package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GcrShopOriginal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15164\\git\\iqbal\\Sele_Auto\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.manage().window().maximize();
		
		WebElement myAccount = driver.findElement(By.xpath("(//*[contains (@class, 'ui-button-text')])[5]"));
		
		myAccount.click();
		
		WebElement emailAddress = driver.findElement(By.xpath("//*[contains (@name, 'email_address')]"));
		emailAddress .sendKeys("miqbalkhan41@yahoo.com");
		
		
		WebElement passWord = driver.findElement(By.xpath("//*[contains (@name, 'password')]"));
		passWord.sendKeys("12345");
		
		WebElement signIn = driver.findElement(By.xpath("(//*[contains(@class,'ui-button-text')])[9]"));
		signIn.click();
		
		WebElement cataLog = driver.findElement(By.xpath("(//*[contains(@class,'headerNavigation')])[2]"));
		cataLog.click();
		
		WebElement newProducts = driver.findElement(By.xpath("//* [contains(@href, 'products_new')]"));
		newProducts.click();
		WebElement page1 = driver.findElement(By.xpath("(//strong[contains(text(), '1')])[1]"));
		page1.click();
		
		WebElement checkProduct = driver.findElement(By.xpath("//*[@id=\"bodyContent\"]/div/div/div/span[2]"));
				checkProduct.click();
				

}
	
}
