package com.winjigo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursesPage {
    private WebDriver driver;

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openAddCourse() {
        driver.findElement(By.xpath("//*[@id=\"CourseManage\"]")).click();
    }

    public void clickAddCourseButton() {
        driver.findElement(By.xpath("//*[@id=\"lnkListAddCourse\"]")).click();
    }

    public boolean isCourseTitleDisplayed() {
        return driver.findElement(By.id("Test Course")).isDisplayed();
    }
}
