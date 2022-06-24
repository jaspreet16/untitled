package com.a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.lang.Thread.sleep;

@Component
public class WelcomePage {

    @Autowired
    private HomePage homePage;
    @Autowired
    private WebDriver driver;


    private By cookies = By.xpath("//button[text()='Only Allow Essential Cookies']");
    private By username = By.name("username");

    private By password = By.name("password");

    private By btn = By.xpath("//div[text()='Log In']");

    public void enteremail() throws InterruptedException {
        driver.findElement(cookies).click();
        sleep(2000);
        driver.findElement(username).sendKeys("your username");
        driver.findElement(password).sendKeys("password");
        sleep(2000);
        driver.findElement(btn).click();
        sleep(5000);
//        return homePage;
    }
}