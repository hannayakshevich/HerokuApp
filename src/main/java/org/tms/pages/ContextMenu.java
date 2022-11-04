package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenu extends BasePage{


    private Actions actions = new Actions(driver);

    @FindBy(xpath = "//div[@id='hot-spot']")
    private WebElement hotSpot;

    public void openPageContextMenu(String url){
        driver.get(url);
    }

    public void openAlert(){
        actions.contextClick(hotSpot).perform();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

}
