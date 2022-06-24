package com.a.tests;


import com.a.pages.HomePage;
import com.a.pages.ProfilePage;
import com.a.pages.WelcomePage;
import com.a.utils.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(SpringConfig.class)
public class LoginTest {

    @Autowired
    private WelcomePage welcomePage;
    @Autowired
    private HomePage homePage;
    @Autowired
    private ProfilePage profilePage;

    @Test
    public void testLogin() throws InterruptedException {
        welcomePage.enteremail();
        homePage.saveInfo(false);
        homePage.notification(false);
        homePage.goToProfile();
        profilePage.printFollowers();
    }
}