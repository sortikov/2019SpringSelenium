package OnlineGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.BrowserFactory;

public class PracticeNegLoginTest {
            public static void main(String[] args) throws Exception {
                WebDriver driver = BrowserFactory.getDriver("chrome");

                driver.get("http://practice.cybertekschool.com/login");
                Thread.sleep(5000);

                driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
                Thread.sleep(2000);

                driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword");
                Thread.sleep(2000);

                driver.findElement(By.xpath("//button[@id='wooden_spoon']")).click();
                Thread.sleep(5000);



                String actualValue =  driver.findElement(By.xpath("//div[@id='flash']")).getText();
                String expectedValue = "\n" +
                        "            Your username is invalid!\n" +
                        "            ";

                if (actualValue.equals(expectedValue)){
                    System.out.println("Negative Login test passed successfully!");
                }else{
                    System.out.println("Negative Login test failed!");
                    System.out.println("Actual result: " + actualValue);
                    System.out.println("Expected result: " + expectedValue);
                }

        driver.quit();

    }
}
