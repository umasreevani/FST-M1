package liveproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class Activity5 {
    public void navigation(){
        System.setProperty("webdriver.gecko.driver", "C:/Windows/System32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
       String jobstitle= driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
       System.out.println("jobstitle " + jobstitle);
       driver.close();

    }

}
