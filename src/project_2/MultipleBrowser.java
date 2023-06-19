package project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultipleBrowser
{
   static   WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        String browser;
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Browser = ");
        browser = ob.nextLine();
        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Wrong Browser name");
        }
        // Enter the URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the title
        System.out.println("Print the title = "+driver.getTitle());
        // Print the Current url
        System.out.println("Print the Current URL = " +driver.getCurrentUrl());
        // Print the page source
        System.out.println("Print the page source = "+driver.getPageSource());

        // Enter the email in email field
        driver.findElement(By.name("username")).sendKeys("primetesting@gmail.com");
        // Enter the password in password field
        driver.findElement(By.name("password")).sendKeys("99999999");

        Thread.sleep(5000);
        driver.close();

    }
}
