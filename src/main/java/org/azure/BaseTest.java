package org.azure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

   @BeforeClass
    public void launchApp(){
       System.setProperty("webdriver.chrome.driver","/Users/gaurav.rai/Documents/DevopsAzureLearning/src/main/resources/drivers/chromedriver");
        driver=new ChromeDriver();

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       driver.get("https://www.udemy.com/");
   }

    @AfterClass
    public void closeApp(){

       driver.quit();

    }

}
