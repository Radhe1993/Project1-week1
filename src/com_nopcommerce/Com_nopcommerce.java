package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Com_nopcommerce
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the title of the page
        System.out.println("Page title = "+driver.getTitle());
        System.out.println("Current URL = "+driver.getCurrentUrl());
        System.out.println("Page Source = "+driver.getPageSource());

        WebElement emailField = driver.findElement(By.id("Email"));
        // Type the email address to the email field element
        emailField.sendKeys("primeTesting456@gmail.com");
        // Find the password field element
        driver.findElement(By.name("Password")).sendKeys("122345");
        // Type the email address to the email field element
        // passwordField.sendKeys("12345678");

        Thread.sleep(5000);
        driver.close();


    }
}
