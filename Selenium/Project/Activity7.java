package liveproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test

public class Activity7 {
    public void joblisting() throws InterruptedException  {
        System.setProperty("webdriver.gecko.driver", "C:/Windows/System32/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click();
        driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("chandra.mucherla5@gmail.com");
        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Automation tester");
        driver.findElement(By.xpath("//input[@id='job_location']")).sendKeys("Bangalore");
        //driver.findElement(By.xpath("//html/body/p")).sendKeys("automation testing");
        driver.switchTo().frame("job_description_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("This is test Job");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@id='application']")).sendKeys("vanivoleti@gmail.com");
        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("IBM India Pvt Ltd");
        //driver.findElement(By.xpath("//input[@id='company_website']")).sendKeys("https://ibm.com");
        driver.findElement(By.xpath("//input[@name='submit_job']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("job_preview_submit_button")).click();
        driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
        Thread.sleep(1000);
        String expectedjob=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/ul/li[5]/a/div[1]/h3")).getText();
        String actualjob="Automation tester";
        Assert.assertEquals(expectedjob,actualjob);
        driver.close();



    }
}
