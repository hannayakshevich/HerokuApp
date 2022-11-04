package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Frames extends BasePage{

    @FindBy(xpath = "//a[@href= '/iframe']")
    private WebElement frameLink;

    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    private WebElement frame;

    @FindBy(xpath = "//body[@id = 'tinymce']")
    private WebElement frameText;

    public void openPageFrame(String url){
        driver.get(url);
    }

    public void openFrame(){
        frameLink.click();
        driver.switchTo().frame(frame);
    }

    public String  getFrameText(){
        return (frameText.getText());
    }
}
