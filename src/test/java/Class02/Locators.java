package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*go to fb com

*/
public class Locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //find the element of email address and send email address to it
        WebElement email=driver.findElement(By.id("email"));
        //send text
        email.sendKeys("anush@gmail.com");
        //pass the password
               WebElement password= driver.findElement(By.name("pass"));
               password.sendKeys("ablabluda");
               //find the button
       // WebElement button= driver.findElement(By.name("login"));
      //  button.click();
        /*
        * go to fb.com and create the account*/
   // WebElement createAccount= driver.findElement(By.linkText("Create new account"));
    //createAccount.click();

        //using partial link text
        //WebElement createAccount= driver.findElement(By.partialLinkText("account"));
        //createAccount.click();

    }
}
