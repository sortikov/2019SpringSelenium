package OnlineGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cybertek.utilities.BrowserFactory;

public class VyTrackLoginLogoutTest {

    public static void main(String[] args) throws Exception {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://qa2.vytrack.com/user/login");
        Thread.sleep(5000);

        driver.findElement(By.id("prependedInput")).sendKeys("user170");
        Thread.sleep(2000);

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(2000);

        driver.findElement(By.id("_submit")).click();
       String actualValue = driver.findElement(By.className("oro-subtitle")).getText();
       String expectedValue = "Quick Launchpad";

       if (actualValue.equals(expectedValue)){
           System.out.println("Login test passed successfully!");
       }else{
           System.out.println("Login test failed!");
           System.out.println("Actual result: " + actualValue);
           System.out.println("Expected result: " + expectedValue);
       }

        Thread.sleep(2000);
       driver.findElement(By.className("dropdown-toggle")).click();
       Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@class='no-hash']")).click();
        Thread.sleep(5000);


//       actualValue = driver.findElement((By.xpath("//h2[@class ='title']"))).getText();
//       expectedValue = "Login";

       WebElement element = driver.findElement((By.xpath("//h2[@class ='title']")));
       element.isDisplayed();

        if (element.isDisplayed()){
            System.out.println("Logout test passed successfully!");
        }else{
            System.out.println("Logout test failed!");
            System.out.println("Actual result: " + actualValue);
            System.out.println("Expected result: " + expectedValue);
        }



        driver.quit();



    }





}
