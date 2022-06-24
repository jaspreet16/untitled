package com.a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Component
public class HomePage {
    @Autowired
    private WebDriver driver;

    private By saveInfo = By.xpath("//button[text()='Not now']");
    private By notification = By.xpath("//button[text()='Not Now']");
    private By profileIcon = By.xpath("//div//img[contains(@alt, 'jaspreet86244')]");
    private By profileLink = By.xpath("//div[text()='Profile']");



    public void saveInfo(boolean b) throws InterruptedException {
        sleep(2000);
        if (!b){
            driver.findElement(saveInfo).click();
        }
        sleep(2000);
    }

    public void notification(boolean b) throws InterruptedException {
        if (!b){
            driver.findElement(notification).click();
        }
        sleep(2000);
    }

    public void goToProfile() throws InterruptedException {
        driver.findElement(profileIcon).click();
        sleep(3000);
    }

}