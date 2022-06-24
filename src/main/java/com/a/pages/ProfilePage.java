package com.a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfilePage {

    @Autowired
    private WebDriver driver;

    private By followers = By.xpath("//div[text()=' followers']");

    public void printFollowers(){
        System.out.println("FOLLOWERS: " + driver.findElement(followers).getText().split(" ")[0]);
    }
}
