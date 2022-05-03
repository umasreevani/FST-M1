package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Activity3 {

    public void url() {
        System.setProperty("webdriver.gecko.driver", "C:/Windows/System32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        WebElement l = driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
        System.out.println(l.getAttribute("src"));
        driver.quit();
    }
}

