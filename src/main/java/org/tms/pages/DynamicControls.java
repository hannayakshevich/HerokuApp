package org.tms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControls extends BasePage{

    WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @FindBy(xpath = "//input[@type = 'checkbox']")
    private WebElement checkBox;

    @FindBy(xpath = "//button[@onclick= 'swapCheckbox()']")
    private WebElement deleteCheckboxButton;

    @FindBy(xpath = "//p[@id= 'message']")
    private WebElement message;

    public void openPageDynamicControls(String url){
        driver.get(url);
    }

    public int finedCheckBox(){
        int countCheckBox = driver.findElements(By.xpath("//input[@type = 'checkbox']")).size();
        return (countCheckBox);
    }
    public void deleteAndWaitCheckBox(){
        deleteCheckboxButton.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(message));
    }
}
