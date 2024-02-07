package com.winjigo.stepdefinitions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.winjigo.pages.CourseCreationPage;
import com.winjigo.pages.CoursesPage;
import com.winjigo.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {

    private WebDriver driver;
    private LoginPage loginPage;
    private CoursesPage coursesPage;
    private CourseCreationPage courseCreationPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        coursesPage = new CoursesPage(driver);
        courseCreationPage = new CourseCreationPage(driver);
    }

    @Given("I am on the Winjigo website")
    public void iAmOnTheWebsite() {
        driver.get("https://swinji.azurewebsites.net");
    }

    @When("I sign in with username {string} and password {string}")
    public void iSignIn(String username, String password) {
        loginPage.login(username, password);
    }

    @When("I open the courses page")
    public void iOpenCoursesPage() {
        loginPage.menuList();
        loginPage.coursesFromMenu();
    }

    @When("I click on Add course button")
    public void iClickCreateCourseButton() {
        coursesPage.openAddCourse();
        coursesPage.clickAddCourseButton();
    }

    @When("I fill course basic info")
    public void iFillCourseBasicInfo() {
        courseCreationPage.fillCourseInfo();
    }

    @When("I save the course")
    public void iSaveTheCourse() {
        courseCreationPage.saveCourse();
    }

    @Then("I should see the course title displayed")
    public void iShouldSeeCourseTitleDisplayed() {
        Assert.assertTrue(coursesPage.isCourseTitleDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

