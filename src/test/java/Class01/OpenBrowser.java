package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        //instance of chromedriver
        WebDriver driver=new ChromeDriver();
        //open the chrome driver and navigate to url
        driver.get("https://www.facebook.com/");
        //maximize the window
        driver.manage().window().maximize();
        //enter full screen mode
        //driver.manage().window().fullscreen();
        //get the title of the webPage
        driver.getTitle();
        String title= driver.getTitle();
        System.out.println("the title of the webPage is "+title);
        //close the webDriver
        //just for observation delete after u are sure
        Thread.sleep(4000);
        driver.quit();
    }
}
