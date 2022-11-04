package org.tms.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tms.pages.DynamicControls;

public class DynamicControlsService {

    DynamicControls dynamicControls = new DynamicControls();
    private static final String WEB_PAGE_DYNAMIC_CONTROLS = "http://the-internet.herokuapp.com/dynamic_controls";

    public void verifyDeletionCheckBox(){
        dynamicControls.openPageDynamicControls(WEB_PAGE_DYNAMIC_CONTROLS);
        dynamicControls.finedCheckBox();
        dynamicControls.deleteAndWaitCheckBox();
    }

    public int finedCheckBox(){
        return (dynamicControls.finedCheckBox());
    }

}
