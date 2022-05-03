package liveproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Activity6 {
    public void jobserach() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/Windows/System32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//input[@id='search_keywords']")).sendKeys("Banking" );
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/form/div[1]/div[4]/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[1]/a/div[1]/h3")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='application_button button']")).click();
        String email=  driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
        System.out.println(email);
        driver.close();


    }
}
