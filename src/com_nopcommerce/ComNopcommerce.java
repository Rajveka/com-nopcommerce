package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ComNopcommerce {

    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        ComNopcommerce obj1 = new ComNopcommerce();
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
        } else {
            System.out.println("Wrong Browser name");
        }
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


            // 2. Open URL
            String baseUrl = "https://demo.nopcommerce.com/";
            driver.get(baseUrl);

            // 3. Print the title of the page
            System.out.println("Title of the page: " + driver.getTitle());

            // 4. Print the current URL
            System.out.println("Current URL: " + driver.getCurrentUrl());

            // 5. Print the page source
            System.out.println("Page Source: " + driver.getPageSource());

            // 6. Navigate to URL
            String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            driver.get(loginUrl);

            // 7. Print the current URL
            System.out.println("Current URL after navigating to login: " + driver.getCurrentUrl());

            // 8. Navigate back to the home page
            driver.navigate().back();

            // 9. Navigate to the login page
            driver.findElement(By.className("ico-login")).click();

            // 10. Print the current URL
            System.out.println("Current URL after navigating back to login: " + driver.getCurrentUrl());

            // 11. Refresh the page
            driver.navigate().refresh();

            // 12. Enter the email to email field
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("test@example.com");

            // 13. Enter the password to password field
            WebElement passwordField = driver.findElement(By.id("Password"));
            passwordField.sendKeys("password");

            // 14. Click on Login Button
            driver.findElement(By.cssSelector("button.login-button")).click();

            // 15. Close the browser
            driver.quit();


    }
}