package liveproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.testng.Assert;

@Test

public class activity1 {
    public void tititle() {
        System.setProperty("webdriver.gecko.driver", "C:/Windows/System32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        //WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]/img"));
        String Actualtitle = driver.getTitle();
        String Expectedtitle = "Alchemy Jobs – Job Board Application";
        Assert.assertEquals(Expectedtitle, Actualtitle);
        driver.close();
    }
}