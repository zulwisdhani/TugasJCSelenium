package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Pelatihan Juara Coding SQA\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Open Browser");
        driver.manage().window().maximize();
        driver.get("https://shop.demoqa.com/my-account/");
        System.out.println("Enter URL My Account");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println(driver.getTitle());

        js.executeScript("window.scrollBy(0,500)"); //scroll vertikal 500px
        driver.findElement(By.id("username")).sendKeys("sindy");
        driver.findElement(By.id("password")).sendKeys("$Sindy1999");
        js.executeScript("window.scrollBy(0,100)"); //scroll vertikal 500px
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")).click();
        System.out.println("Button login clicked");

        driver.get("https://shop.demoqa.com/product/black-pointed-toe-barely-there-patent-heels/");
        js.executeScript("window.scrollBy(0,500)"); //scroll vertikal 500px
        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.selectByVisibleText("Black");
        Select size = new Select(driver.findElement(By.id("pa_size")));
        size.selectByVisibleText("37");
        js.executeScript("window.scrollBy(0,100)"); //scroll vertikal 500px
        driver.findElement(By.xpath("//*[@id=\"product-1281\"]/div[1]/div[2]/form/div/div[2]/button")).click();
    }
}