package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUpload extends BasePage{

    @FindBy(xpath = "//input[@id= 'file-upload']")
    private WebElement buttonFileUpload;

    @FindBy(xpath = "//input[@id= 'file-submit']")
    private WebElement buttonUpload;

    @FindBy(xpath = "//div[@id= 'uploaded-files']")
    private WebElement uploadedFiles;

    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public void openPageFileUpload(String url){
        driver.get(url);
    }

    public void fileUpload(){
        buttonFileUpload.click();
        buttonFileUpload.sendKeys("D:\\Locators and Selectors.pptx");
        buttonUpload.click();
    }

    public String getFileText(){
        return (uploadedFiles.getText());
    }
}
