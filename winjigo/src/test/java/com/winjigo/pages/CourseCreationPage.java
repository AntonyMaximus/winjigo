package com.winjigo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseCreationPage {
    private WebDriver driver;

    public CourseCreationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCourseInfo() {
        driver.findElement(By.xpath("//*[@id=\"txtCourseName\"]")).sendKeys("Test Course");
        driver.findElement(By.xpath("//*[@id=\"courseGrade\"]")).sendKeys("2");
        driver.findElement(By.xpath("//*[@id=\"teacherOnBehalf\"]/div[1]/span/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"lblCourseOwnerProfilePic\"]")).click();
    }

    public void saveCourse() {
        driver.findElement(By.xpath("//*[@id=\"btnSaveAsDraftCourse\"]")).click();
    }
}
