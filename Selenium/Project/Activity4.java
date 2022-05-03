package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class Activity4 {
    public void secondheader(){
        System.setProperty("webdriver.gecko.driver", "C:/Windows/System32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        String Expectedtext=driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/h2")).getText();
        String ActualText="Quia quis non";
        System.out.println("expected test " + Expectedtext);
        Assert.assertEquals(Expectedtext,ActualText);
        driver.close();

    }
}
