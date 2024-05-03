package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators02 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username =driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement pass=driver.findElement(By.id("ctl00_MainContent_password"));
        pass.sendKeys("test");
        WebElement button=driver.findElement(By.className("button"));
        button.click();
        //confirm login
        WebElement message=driver.findElement(By.className("login_info"));
        //get the text from the webelement after login
        String text = message.getText();
        //print out
        System.out.println("the text is "+text);
        //get the title of the webpage
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("Web Orders")){
            System.out.println("you have logged in");
        }else{
            System.out.println("you haven't logged in");
        }




    }
}
