package project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ComOrangehrmlive
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        System.out.println("Print the title = "+driver.getTitle());
        // Get current UrL
        System.out.println("Print the current URL = "+driver.getCurrentUrl());
        // Get Page source
       System.out.println("Print the Source = "+driver.getPageSource());
        // Send Email
        driver.findElement(By.name("username")).sendKeys("Admin@gmail.com");
        // Send password
        driver.findElement(By.name("password")).sendKeys("admin123");

        Thread.sleep(2000);
        driver.close();



    }
}
