package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultipleBrowser
{       static  WebDriver driver ;
    public static void main(String[] args) throws InterruptedException {
        String browser;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the Browser = ");
        browser = ob.nextLine();

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // Open multiple browser

        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();

        }
       else if(browser.equalsIgnoreCase("Firefox"))
        {
           driver = new FirefoxDriver();
        }
       else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }
       else
        {
            System.out.println("Wrong Browser name");
        }

       driver.get(baseUrl);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       // Print the title
        System.out.println("Print the title = "+driver.getTitle());

        // Print the Current Url
        System.out.println("Print the Current Url = "+driver.getCurrentUrl());

        // Print the page source
        System.out.println("Print the page source = "+driver.getPageSource());

        // Enter the email in email field
        driver.findElement(By.id("Email")).sendKeys("siyaram@gmail.com");
        // Enter the password in password field
        driver.findElement(By.name("Password")).sendKeys("90807060");

        Thread.sleep(5000);
        driver.close();

    }
}
