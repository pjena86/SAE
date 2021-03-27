package com.pageObjectRepo;

import com.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends CommonMethods {

    private By headerObj = By.xpath("//h1");
    private By instructionObj = By.xpath("//p");
    private By emailTextbox = By.xpath("//b");
    private By pswdTextbox = By.xpath("//input[@name='email']");
    private By repeatPswdTextbox = By.xpath("//input[@name='repeat']");
    private By homePageBtn = By.xpath("//*[@class='cancelbtn']");
    private By btnSignup = By.xpath("//button[@class='Sign Up']");


    WebDriver driver = new ChromeDriver();


    public String getHeaderObj() {
        return waitForExpectedElement(headerObj).getText();
    }

    public String getInstructionObjText() {
        return waitForExpectedElement(instructionObj).getText();
    }

    public WebElement emailText() {
        return waitForExpectedElement(emailTextbox);
    }

    public WebElement pswdText() {
        return waitForExpectedElement(pswdTextbox);
    }

    public void clickHomePageBtn() {
        driver.findElement(homePageBtn).click();
    }


}
