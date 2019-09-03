import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[]args){
    System.setProperty("webdriver.chrome.driver","C:\\selenium\\crome\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

   // driver.get("https://automationintesting.com/selenium/java/lessons/navigation");
    driver.navigate().to("https://automationintesting.com/selenium/java/lessons/navigation");
    driver.navigate().back();



}


}
