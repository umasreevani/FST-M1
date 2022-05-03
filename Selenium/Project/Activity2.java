package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class Activity2 {

    public void header() {
        System.setProperty("webdriver.gecko.driver", "C:/Windows/System32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        String Actualheader= driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
        System.out.println(Actualheader);
        String Expectedheader="Welcome to Alchemy Jobs";
        Assert.assertEquals(Actualheader,Expectedheader);



    }
}
