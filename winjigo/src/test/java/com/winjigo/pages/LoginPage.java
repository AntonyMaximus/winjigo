package com.winjigo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("inputPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }

    public void menuList(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div[2]/div/div[2]/ul/li[3]/button")).click();
    }

    public void coursesFromMenu(){
        driver.findElement(By.xpath("//*[@id=\"btnMyCoursesListMobile\"]")).click();
    }
}
